package com.shay.Web_Automation_Baics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe extends BaseDriver{

	String url = "https://demoqa.com/frames";
	
	public void iframeTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		driver.switchTo().frame();
		
		List<WebElement> iframeNumber = driver.findElements(By.tagName("iframe"));
		System.out.print(iframeNumber.size());
		
		driver.switchTo().frame(1); // je frame content ase oi frame e age enter kore tarpor kaj korte hobe
		
		WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(text.getText());
		
		//kaj sesh hoye gele abr frame theke ber hote hobe tanahole onno kothau kaj korte parbo na 
		driver.switchTo().defaultContent();//eta diye default page contente e ahte hobe
		
		WebElement text2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(text2.getText());
		
		//ekta frame theke direct arekta frame e jawa jabe na. age default contet e giye then new frame e jete hobe
	
		
		

		
		
		
		
	}
}
