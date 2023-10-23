package com.shay.Web_Automation_Baics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertExample extends BaseDriver{
	String url = "https://demoqa.com/alerts";
	
	@Test
	public void AlertTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
		
		
		WebElement alert1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alert1.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert(); //age alert e switch kore nite hobe kono alert e click korte hole
		alert.accept();
		Thread.sleep(1000);
		
		WebElement alert2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		alert2.click();
		Thread.sleep(1000);
		alert.dismiss();
		Thread.sleep(1000);
		
		WebElement alert3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		alert3.click();
		alert.sendKeys("MasudKhan");
		Thread.sleep(1000);
		alert.accept();
		
	}
}
