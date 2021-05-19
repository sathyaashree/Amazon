package com.Blaze;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	public static void getDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void launchUrl(String data) {
		driver.get(data);
	}

	public static void enterText(WebElement el, String data) {
		el.sendKeys(data);
	}

	public static void btnClick(WebElement el) {
		el.click();
	}

	public static void moveToElement(WebElement el) {
		Actions ac = new Actions(driver);
		ac.moveToElement(el).perform();
	}

	public static void enterTextByJs(String data, WebElement el) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", el);
	}

	public static void dragAndDrop(WebElement s, WebElement d) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(s, d);
	}

	public static void rightClick(WebElement el) {
		Actions ac = new Actions(driver);
		ac.contextClick(el).perform();
	}

	public static void doubleClick(WebElement el) {
		Actions ac = new Actions(driver);
		ac.doubleClick(el).perform();
	}

	public static void keyDownandkeyUp(WebElement d) {
		Actions ac = new Actions(driver);
		ac.keyDown(d, Keys.SHIFT).sendKeys(d, "AAA").keyUp(d, Keys.SHIFT).perform();
	}

	public static void simpleAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
		al.dismiss();

	}

	public static void confirmAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
		al.dismiss();
	}

	public static void promptAlert() {
		Alert al = driver.switchTo().alert();
		al.sendKeys("text");
	}

	public static void scrollDown(String data, WebElement el) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", el);
	}

	public static void scrollUp(String data, WebElement el) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", el);
	}

	public static void selectByValue(WebElement el, String value) {
		Select se = new Select(el);
		se.selectByValue(value);
	}

	public static void selectByIndex(WebElement el, int value) {
		Select se = new Select(el);
		se.selectByIndex(value);
	}

	public static void selectByVisibleText(WebElement el, String value) {
		Select se = new Select(el);
		se.selectByVisibleText(value);
	}

	public static void getOptions(WebElement el) {
		Select se = new Select(el);
		se.getOptions();
	}

	public static void getFirstSelectedOption(WebElement el) {
		Select se = new Select(el);
		se.getFirstSelectedOption();
	}

	public static void getAllSelectedOption(WebElement el) {
		Select se = new Select(el);
		se.getAllSelectedOptions();
	}

	public static void deSelectByValue(WebElement el, String data) {
		Select se = new Select(el);
		se.deselectByValue(data);
	}

	public static void deSelectByIndex(WebElement el, int id) {
		Select se = new Select(el);
		se.deselectByIndex(id);
	}

	public static void deSelectByVisibleText(WebElement el, String data) {
		Select se = new Select(el);
		se.deselectByVisibleText(data);
	}

	public static void deSelectAll(WebElement el) {
		Select se = new Select(el);
		se.deselectAll();
	}

	public static void isMultiple(WebElement el) {
		Select se = new Select(el);
		se.isMultiple();
	}

	public static void frameWebMehod(WebElement el) {
		driver.switchTo().frame(el);
	}

	public static void frameStringMehod(WebElement el, String name) {
		driver.switchTo().frame(name);
	}

	public static void frameintMehod(WebElement el, int id) {
		driver.switchTo().frame(id);
	}

	public static void frameParentMehod(WebElement el) {
		driver.switchTo().parentFrame();
	}

	public static void frameDefaultContent(WebElement el) {
		driver.switchTo().defaultContent();
	}

	public static WebElement findElementId(String name) {
		WebElement findElement = driver.findElement(By.id(name));
		return findElement;
	}

	public static WebElement findElementName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}

	public static WebElement findElementTagName(String name) {
		WebElement findElement = driver.findElement(By.tagName(name));
		return findElement;
	}

	public static WebElement findElementXpath(String name) {
		WebElement findElement = driver.findElement(By.xpath(name));
		return findElement;
	}

	public static List<WebElement> findElementsId(String name) {
		List<WebElement> findElements = driver.findElements(By.id(name));
		return findElements;
	}

	public static List<WebElement> findElementsName(String name) {
		List<WebElement> findElements = driver.findElements(By.name(name));
		return findElements;
		
	}

	public static List<WebElement> findElementsTagName(String name) {
		List<WebElement> findElements = driver.findElements(By.tagName(name));
		return findElements;
	}

	public static List<WebElement> findElementsXpath(String name) {
		List<WebElement> findElements = driver.findElements(By.xpath(name));
		return findElements;

	}

	public static void screenShot(String name) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		ts.getScreenshotAs(OutputType.FILE);
	}

	public static void StringBuffer(String name) {
		StringBuffer s = new StringBuffer(name);
		StringBuffer rev = new StringBuffer("");
	}

	public static void List(int id) {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
	}
	public static String filecreationpath(String path, String Sheetname,int rno,int cno) throws IOException {
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(Sheetname);
		Row row=s.getRow(rno);
		Cell cell=row.getCell(cno);
		int cellType=cell.getCellType();
		String value="";
		if (cellType ==1) {
		value = cell.getStringCellValue();
		}else if (DateUtil.isCellDateFormatted(cell)) {
		Date dateCellValue = cell.getDateCellValue();
		SimpleDateFormat format = new SimpleDateFormat("DD-MM-YYYY");
		value = format.format(dateCellValue);
		}else {
		double numericCellValue = cell.getNumericCellValue();
		long l =(long) numericCellValue;
		value=String.valueOf(l);
		}
		return value;

}

}
