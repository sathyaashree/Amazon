package com.Amazon;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class AmazonAssessment extends Baseclass {
	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest test;

	@BeforeClass
	public void tc0() throws IOException {
		reports = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("Amazon.html");
		reports.attachReporter(htmlReporter);
		getDriver();
		launchUrl("https://www.amazon.in/");
		screenShot("C:\\Users\\LT07052020\\eclipse-workspace\\NGTestingnew\\target");
	}


	@Test
	public void tc1() throws IOException {
		LoginPOM Login = new LoginPOM();
		test = reports.createTest("Validating home page");
		test.log(Status.INFO, "Verify url");
		if (driver.getCurrentUrl().contains("amazon")) {
			test.log(Status.PASS, "Validated url");
		} else {
			test.log(Status.FAIL, "Invalid URL");
		}
		Login.getBtnAcc().click();
		WebElement txtEmail = Login.getTxtEmail();
		txtEmail.sendKeys(Baseclass.filecreationpath(
				"C:\\Users\\LT07052020\\eclipse-workspace\\NGTestingnew\\Excel\\Data.xlsx", "Details", 0, 0));
		test.log(Status.INFO, "Validate Username");
		if (txtEmail.isEnabled()&& txtEmail.isDisplayed()) {
		}
		else {
			test.log(Status.FAIL, "Username field is not enabled");
		}
		Login.getBtnContinue().click();
		WebElement txtPass = Login.getTxtPass();
		txtPass.sendKeys(Baseclass.filecreationpath(
				"C:\\Users\\LT07052020\\eclipse-workspace\\NGTestingnew\\Excel\\Data.xlsx", "Details", 1, 0));
		if (txtPass.isEnabled()&& txtPass.isDisplayed()) {
		}
		else {
			test.log(Status.FAIL, "Password field is not enabled");
		}
		Login.getBtnSignin().click();
	}

	@Test
	public void tc2() throws IOException {
		test = reports.createTest("Product Search");
		WebElement btnSrc = driver.findElement(By.id("nav-search-submit-button"));
		test.log(Status.INFO, "Verifying Home page");
		if (btnSrc.isDisplayed()) {
			test.log(Status.PASS, "Search Button Enabled");
			File screenShot = btnSrc.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("SearchProduct.png"));
			test.addScreencastFromPath("SearchProduct.png");
		} else {
			test.log(Status.FAIL, "Search Button is not enabled");
		}
		ProdSeacrchPOM prod = new ProdSeacrchPOM();
		prod.getTxtprod().sendKeys(Baseclass.filecreationpath(
				"C:\\Users\\LT07052020\\eclipse-workspace\\NGTestingnew\\Excel\\Data.xlsx", "Details", 2, 0));
		WebElement btnSearch = prod.getBtnSearch();
		btnSearch.click();

	}

	@Test
	public void tc3() {
		MobilePOM Mobile = new MobilePOM();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Mobile.getBtnprod().click();

	}

	@Test
	private void tc4() throws IOException {
		CartPOM cart = new CartPOM();
		String parWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		for (String string : allWin) {
			if (!parWin.equals(string)) {
				driver.switchTo().window(string);
			}
		}
		cart.getBtnAddToCart().click();
		cart.getBtnProceedButton().click();
	}
@Test
private void tc5() {
DeleteCart del=new DeleteCart();
del.getBtnaddress().click();
del.getBtnDelete().click();
del.getBtnCDelete().click();
}

@AfterClass
private void tc06() {
reports.flush();
driver.quit();
}
	}

