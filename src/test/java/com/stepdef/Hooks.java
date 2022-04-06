package com.stepdef;

import org.utils.LibGlobal;

import cucumber.api.Scenario;

public class Hooks extends LibGlobal {

	@cucumber.api.java.Before
	private void Before(Scenario sc) {
		System.out.println("Before");
		String name = sc.getName();
		System.out.println(name);
		getdriver();
	}
	@cucumber.api.java.After
	private void After(Scenario sc) {
		System.out.println("After");
		boolean failed = sc.isFailed();
		System.out.println(failed);
		closebrowser();
		
		
		
	}
	
	
}
