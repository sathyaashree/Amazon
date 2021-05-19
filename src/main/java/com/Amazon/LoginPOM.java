package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM extends Baseclass {

public LoginPOM() {
PageFactory.initElements(driver, this);
	
}
@FindAll({@FindBy(xpath="//span[@class='nav-line-2 nav-short-width']"),@FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]")})
private WebElement btnAcc;

@FindBy(id="ap_email")
private WebElement txtEmail;

@FindBy(id="continue")
private WebElement btnContinue;

@FindBy(id="ap_password")
private WebElement txtPass;

@FindBy(id="signInSubmit")
private WebElement btnSignin;public WebElement getBtnAcc() {
	return btnAcc;
}

public WebElement getTxtEmail() {
	return txtEmail;
}

public WebElement getBtnContinue() {
	return btnContinue;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtnSignin() {
	return btnSignin;
}

}