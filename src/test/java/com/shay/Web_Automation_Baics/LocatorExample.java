package com.shay.Web_Automation_Baics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExample extends BaseDriver {
	String url = "https://demo.opencart.com/index.php?route=account/login&language=en-gb";
	
	@Test
	public void locator() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Find Element By ID attribute
		WebElement email = driver.findElement(By.id("input-email"));
		email.click();
		email.clear();//jodi age theke kicu field e lekaa thake ta remove korte
		email.sendKeys("test@gmail.com");
//		System.out.println(email.getAttribute("attribute value")); // jodi kono required conditon thake field e tkhn seta check korte evae rpint korte dekhte pari. pore abr eta store kore compare o kora jay
//		System.out.println(driver.getTitle());
//		System.out.println(email.getText()); // edhoroner bivinno jinish amra nite pari website theke
		Thread.sleep(1000);
		
		//Find Element By Name attribute
		WebElement password = driver.findElement(By.name("password"));
		password.click();
		password.sendKeys("12345");
		Thread.sleep(1000);
		
		
		//Find element by LInk Tesxt
		WebElement forgetPassword = driver.findElement(By.linkText("Forgotten Password"));
		forgetPassword.click();
		Thread.sleep(1000);
		
		//FInd Eleent by Partial LInk Text // ektu text match korlei hoy 
		WebElement continueBTN = driver.findElement(By.partialLinkText("Address"));
		continueBTN.click();
		Thread.sleep(1000);
		
		/*Find Eelemtn BY xPATH
		Defatul fromate = //TagName[@attribitueName="attribute value"]
		evabeo caile puro document scan kore lekha jay //*[@attribitueName="attribute value"]
		*/
	
	
	}
	
		
		
		
}
