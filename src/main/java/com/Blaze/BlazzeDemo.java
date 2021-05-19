package com.Blaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BlazzeDemo extends Baseclass {
	@BeforeClass
	private void launch() {
		Baseclass.getDriver();
		Baseclass.launchUrl("https://www.blazedemo.com/");
	}

//	@AfterClass
//	private void quit() {
//	driver.quit();
//	}
	@Test
	private void demo() {
		DemoBlazzePOM demo = new DemoBlazzePOM();
		WebElement txtdep = demo.getTxtdep();
		demo.selectByVisibleText(txtdep, "Boston");
		WebElement txtdest = demo.getTxtdest();
		demo.selectByVisibleText(txtdest, "London");
		demo.getBtnfindflight().click();
		demo.getBtnchooseflight().click();
		demo.getBtnpurflight().click();
		WebElement main = driver.findElement(By.xpath("//table[@class='table']"));
		java.util.List<WebElement> tr = main.findElements(By.tagName("tr"));
		WebElement row = tr.get(1);
		java.util.List<WebElement> td = row.findElements(By.tagName("td"));
		for (int i = 0; i < td.size(); i++) {
		WebElement trow = td.get(i);
		String text = trow.getText();
		System.out.println(text);
			
		}
	}
}
