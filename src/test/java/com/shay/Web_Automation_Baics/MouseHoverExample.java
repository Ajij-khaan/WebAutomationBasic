package com.shay.Web_Automation_Baics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverExample extends BaseDriver{
	String url = "https://daraz.com.bd";
	
	@Test
	public void hoverTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
		
		WebElement sports = driver.findElement(By.xpath("//span[contains(text(),'Sports & Outdoors')]"));
		action.moveToElement(sports).perform();
		Thread.sleep(1000);
		
		WebElement outdoor = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[11]/li[8]/a[1]/span[1]"));
		action.moveToElement(outdoor).perform();
		Thread.sleep(1000);
		
		WebElement golf = driver.findElement(By.xpath("//span[contains(text(),'Golf')]"));
		golf.click();
		Thread.sleep(1000);
		
		
	}
	
}
