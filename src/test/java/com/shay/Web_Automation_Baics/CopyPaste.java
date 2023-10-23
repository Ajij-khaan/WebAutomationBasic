package com.shay.Web_Automation_Baics;

import javax.net.ssl.SSLEngineResult.HandshakeStatus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyPaste extends BaseDriver{
	String url = "https://demoqa.com/automation-practice-form";
	
	@Test
	public void CopyPasteTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.click();
		firstName.sendKeys("Masud Khan");
		Thread.sleep(1000);
		
		//Select
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//Copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("C");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//Move to next field by tab
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		//Paste
		action.keyDown(Keys.CONTROL);
		action.sendKeys("V");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(5000);
		
	}
}
