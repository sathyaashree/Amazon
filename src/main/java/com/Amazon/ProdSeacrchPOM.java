package com.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdSeacrchPOM extends Baseclass {
	public ProdSeacrchPOM() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="twotabsearchtextbox")
	private WebElement txtprod;
	
	@FindAll({@FindBy(id="nav-search-submit-button"),@FindBy(xpath="//input[@type='submit']")})
	private WebElement btnSearch;
	
	public WebElement getTxtprod() {
		return txtprod;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
}
