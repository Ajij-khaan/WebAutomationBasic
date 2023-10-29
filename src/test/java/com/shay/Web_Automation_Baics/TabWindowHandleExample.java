package com.shay.Web_Automation_Baics;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class TabWindowHandleExample extends BaseDriver{
	String url = "https://amazon.com";
	String secondURL = "https://google.com";
	
	@Test
	public void tabWindowHandleExample() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String originalTab = driver.getWindowHandle(); //tab er info take save kore rakhbo jate pore oi tab e aste pari
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.TAB); // newTab open korte hole windows type tab dite hobe. ar new window er jonno window type window hobe
		String secondTab = driver.getWindowHandle();

		driver.get(secondURL);
		Thread.sleep(1000);
		
		driver.switchTo().window(originalTab);
		Thread.sleep(1000);
		
		driver.switchTo().window(secondTab);
		Thread.sleep(1000);
	}
}
