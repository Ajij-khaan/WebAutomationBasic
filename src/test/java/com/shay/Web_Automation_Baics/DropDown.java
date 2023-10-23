package com.shay.Web_Automation_Baics;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends BaseDriver{
String url = "https://www.amazon.com/ref=nav_logo";
	
	@Test
	public void dropDwonTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
	
		
		WebElement categories = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(categories);
		select.selectByIndex(4);
		Thread.sleep(1000);
		
		select.selectByVisibleText("Books");
		Thread.sleep(1000);
	}
}
