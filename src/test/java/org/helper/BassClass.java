package org.helper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BassClass {
	public static WebDriver driver;
	public static WebDriver browser_Launch() {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Reshma\\\\\\\\Desktop\\\\\\\\selenium\\\\\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void sendkeys(WebElement element,String keys) {
		element.sendKeys(keys);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void navi_To(String Url) {
		driver.navigate().to(Url);
	}
	public static void navi_Back() {
		driver.navigate().back();
	}
	public static void navi_Forward() {
		driver.navigate().forward();
	}
	public static void page_Launch(String url) {
		driver.get(url);
	}
	public static void alert(String value) {
		driver.findElement(By.xpath(value)).click();
		driver.switchTo().alert().accept();
	}
	public static void mouse_Click(String value) {
		Actions ac=new Actions(driver);
		ac.click().build().perform();
	}
	public static void context_click(String value) {
		Actions ac=new Actions(driver);
		WebElement contextclick=driver.findElement(By.xpath(value));
		ac.contextClick(contextclick).build().perform();
	}
	public static void double_click(String value) {
		Actions ac=new Actions(driver);
		WebElement doubleclick=driver.findElement(By.xpath(value));
		ac.contextClick(doubleclick).build().perform();
	}
	public static void move_To_Element(String value) {
		Actions ac=new Actions(driver);
		WebElement movetoele=driver.findElement(By.xpath(value));
		ac.moveToElement(movetoele).build().perform();
	}
	public static void single_Frame(WebElement keys) {
		driver.switchTo().frame(keys);
	}
	public static void multi_Frame(WebElement element,WebElement element1) {
		driver.switchTo().frame(element);
		driver.switchTo().frame(element1);
	}
	public static void selectbyvalue_Dropdown(WebElement value,String value1) {
		Select s=new Select(value);
		s.selectByValue(value1);
	}
	public static void selectbyvisibletext_Dropdown(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void checkbox(WebElement element) {
	     element.click();
	}
	public static void is_Enable(WebElement element) {
		boolean enabled=element.isEnabled();
		System.out.println(enabled);
	}
	public static void is_Displayed(WebElement element) { 
		boolean display=element.isDisplayed();
		System.out.println(display);
	}
	public static void is_Selected(WebElement element) {
		boolean select=element.isSelected();
		System.out.println(select);
	}
	public static void get_Option(WebElement element) {
		Select s=new Select(element);
		List<WebElement>options2=s.getOptions();
		for (WebElement webElement:options2) {
			System.out.println(webElement.getText());
		}
	}
	public static void page_title() {
		System.out.println(driver.getTitle());
	}
	public static void page_Url(String value) {
		System.out.println(driver.getCurrentUrl());
	}
	public static void  get_Text(WebElement element) {
		System.out.println(element.getText());
	}
	public static void get_Attribute(WebElement element,String value) {
	System.out.println(element.getAttribute(value));	
	}
	public static void screenshot(String name)throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Reshma\\eclipse-workspace\\demo\\Screenshot\\"+name+".png");
		FileUtils.copyFile(source, destination);
	}
	public static void scroll(int a,int b) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(a,b);");
	}
	public static void get_First_Selected(WebElement element) {
		Select s=new Select(element);
		System.out.println(s.getFirstSelectedOption());
	}
	public static void get_All_Selected(WebElement element) {
		Select s=new Select(element);
		List<WebElement>all=s.getAllSelectedOptions();
		for(WebElement web:all) {
			System.out.println(web.getText());
		}
	}
	public static void is_Multiple(WebElement element) {
		Select s=new Select(element);
		System.out.println(s.isMultiple());
	}
	public static void radiobutton(WebElement element) {
		element.click();
	}
	public static void dropDown(WebElement element,int index) {
		Select a=new Select(element);
		a.selectByIndex(index);
		//a.deselectByIndex(index);
	}
	public static void dropDown_value(WebElement element,String value) {
		Select a=new Select(element);
		a.selectByValue(value);
		//a.deselectByValue(value);
	}
	public static void dropDown_visibletext(WebElement element,String text) {
		Select a=new Select(element);
		a.selectByVisibleText(text);
		//a.deselectByVisibleText(text);
	}
	public static void dropDown_index(WebElement element,int index) {
		Select a=new Select(element);
		a.selectByIndex(index);
		//a.deselectByIndex(index);
	}
	public static void clear(WebElement element) {
	 element.clear();
	}
	
	
	
	
	
	
	
	
	
	

	}
	
	
	

