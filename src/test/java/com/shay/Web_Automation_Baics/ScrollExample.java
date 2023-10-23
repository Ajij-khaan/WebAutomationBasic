package com.shay.Web_Automation_Baics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollExample extends BaseDriver{
	String url = "https://www.alibaba.com/";
	
	@Test
	public void scrollTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Scroll To bottom/Down
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		
		//Scroll to Top
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(1000);
		
		//Scroll to Specifi portion
		WebElement location = driver.findElement(By.xpath("//*[contains(text(), \"New this week\")]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", location);
		Thread.sleep(5000);
		
		
	}
}
