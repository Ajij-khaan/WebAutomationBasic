package com.shay.Web_Automation_Baics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitExample extends BaseDriver{
String url = "https://demo.opencart.com/";
	
	@Test
	public void waitTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
	
		//Implicit // er mane holo full page load houa porjonto wait korbe bt eta ekhn ar testng te use hoy na
		//karon test ng er default vabe etka time diye niye ney
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//	explicit // holo kono ekta nirdisti locatior er jonno wait kora.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement search = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"ssearch\"]")));
//		WebElement search = driver.findElement(By.xpath("//input[@name=\\\"search\\\"]"));
	}
}
