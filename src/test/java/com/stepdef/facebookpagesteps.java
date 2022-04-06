package com.stepdef;

import java.io.IOException;
import java.util.List;

import org.frame.facebookpagepojo;
import org.junit.Assert;
import org.utils.LibGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class facebookpagesteps extends LibGlobal {

	private String string s ;
	@Given("User Launch the browser")
	public void user_Launch_the_browser() {
	    getdriver();
	}

	@Given("User enters the Url")
	public void user_enters_the_Url() {
	   geturl("https://www.facebook.com/");
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password(DataTable table) throws IOException {
	   facebookpagepojo fb = new facebookpagepojo();
	  List<List<String>> asLists = table.asLists();
	  List<String> list = asLists.get(0);
	  String s  = list.get(0);
	  System.out.println(s);
	  List<List<String>> Lists2 = table.asLists();
	  List<String> list2 = Lists2.get(1);
	  
	   
	}

	@When("User enters the login button")
	public void user_enters_the_login_button() {
	    facebookpagepojo fb = new facebookpagepojo();
	    click(fb.getBtnLogin());
	}

	@Then("User navigate to login failure page")
	public void user_navigate_to_login_failure_page() {
		String currenturl = getcurrenturl();
		Assert.assertTrue("not navigate to login failure page", currenturl.contains("login"));
		closebrowser();
	   
	}
	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String UserName, String Password) {
	  facebookpagepojo fb = new facebookpagepojo();
	  insertType(fb.getTxtBoxUserName(), UserName);
	  insertType(fb.getTxtBoxPass(), Password);
	}



}
