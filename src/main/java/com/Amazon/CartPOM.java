package com.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPOM extends Baseclass {
	public CartPOM() {
	PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id="add-to-cart-button"),@FindBy(xpath="//input[@title='Add to Shopping Cart']")})
	private WebElement btnAddToCart;
	
	@FindBy(xpath="//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")
	private WebElement btnProceedButton;

	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}

	public WebElement getBtnProceedButton() {
		return btnProceedButton;
	}

	

		
	}


