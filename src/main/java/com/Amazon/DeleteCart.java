package com.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCart extends Baseclass {
public DeleteCart() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="(//div[@class='ship-to-this-address a-button a-button-primary a-button-span12 a-spacing-medium  '][1])")
private WebElement btnaddress;

@FindBy(xpath="//a[@class='pipeline-link']")
private WebElement btnDelete;

@FindBy(xpath="//a[@data-action='itemselect-delete-item-row']")
private WebElement btnCDelete;

public WebElement getBtnaddress() {
	return btnaddress;
}

public WebElement getBtnDelete() {
	return btnDelete;
}

public WebElement getBtnCDelete() {
	return btnCDelete;
}


}


