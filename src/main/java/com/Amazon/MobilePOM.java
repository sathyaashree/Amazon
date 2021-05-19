package com.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePOM extends Baseclass {
	public MobilePOM() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement btnprod;
	

	public WebElement getBtnprod() {
		return btnprod;
	
	}
	
}
