package com.Blaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DemoBlazzePOM extends Baseclass {
	public DemoBlazzePOM() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(name="fromPort"),@FindBy(xpath="//select[@name='form-inline'][1]")})
	private WebElement txtdep;

	@FindAll({@FindBy(name="toPort"),@FindBy(xpath="//select[@class='form-inline'][2]")})
	private WebElement txtdest;

	@FindBy(xpath="//input[@value='Find Flights']")
	private WebElement btnfindflight;

	@FindBy(xpath="(//input[@value='Choose This Flight'])[3]")
	private WebElement btnchooseflight;

	@FindBy(xpath="//input[@value='Purchase Flight']")
	private WebElement btnpurflight;

	public WebElement getTxtdep() {
		return txtdep;
	}

	public WebElement getTxtdest() {
		return txtdest;
	}

	public WebElement getBtnfindflight() {
		return btnfindflight;
	}

	public WebElement getBtnchooseflight() {
		return btnchooseflight;
	}

	public WebElement getBtnpurflight() {
		return btnpurflight;
	}
	

		}


