package org.frame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.LibGlobal;

import com.stepdef.Hooks;

public class facebookpagepojo extends LibGlobal {


public facebookpagepojo() {
	PageFactory.initElements(Hooks.driver, this);
}

@FindBy(id="email")
	private WebElement txtBoxUserName;

@FindBy(id="pass")
private WebElement txtBoxPass;

@FindBy(name="login")
private WebElement btnLogin;

public WebElement getTxtBoxUserName() {
	return txtBoxUserName;
}


public WebElement getTxtBoxPass() {
	return txtBoxPass;
}

public WebElement getBtnLogin() {
	return btnLogin;
}































}
