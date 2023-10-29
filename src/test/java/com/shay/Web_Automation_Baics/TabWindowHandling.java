package com.shay.Web_Automation_Baics;

import org.testng.annotations.Test;

public class TabWindowHandling extends BaseDriver{

String url = "https://demoqa.com/frames";
	
	@Test (priority = 0)
	public void iframeTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		driver.switchTo().frame();
		
		//Will Do it later.
	}
}
