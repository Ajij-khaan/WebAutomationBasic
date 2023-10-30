	package com.shay.Web_Automation_Baics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VisibilityExample extends BaseDriver{
	
	String url = "https://demo.opencart.com/";
	
	@Test
	public void visibilityTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name=\"search\"]"));
		
		//		searchBox.isEnabled();
		//		searchBox.isSelected();
		//		searchBox.isDisplayed()
		
		try {
			if(searchBox.isDisplayed()) {
				searchBox.click();
				searchBox.sendKeys("Bangladesh");
				Thread.sleep(3000);
				
				//Reports
			}
			
		} catch (Exception e) {
			System.out.println(e);
			//Reports
		}
	}

}
