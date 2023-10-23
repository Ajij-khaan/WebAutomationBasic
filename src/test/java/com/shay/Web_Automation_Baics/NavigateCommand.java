package com.shay.Web_Automation_Baics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigateCommand extends BaseDriver{
		
	String url = "https://www.unimart.online/";
	
	@Test
	public void navigateTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement Login = driver.findElement(By.xpath("//a[@class='top-bar-item'][normalize-space()='Login']"));
		Login.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().to("https://google.com");
		Thread.sleep(1000);
		
//		driver.get(url) // eta diye amra browser er url open kori
		
		String currentURL = driver.getCurrentUrl(); // eta diye current page er url dekhte parui
		System.out.println(currentURL);
		
		String actualTitle = driver.getTitle(); //eta diye title nite pari
		System.out.println(actualTitle);
		
//		driver.close() //eta diye browser er current tab ta close hoye jabe
//		driver.quit(); //eta diye automation seseh puro broswer close hoye jabe.
		
	}
}
