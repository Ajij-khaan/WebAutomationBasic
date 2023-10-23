package com.shay.Web_Automation_Baics;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver{
	String url = "https://www.selenium.dev/";
	
	@Test
	public void openURL() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize(); //browser windows fullscrean kora
		Thread.sleep(3000); //1000 ms = 1second
		
//		driver.findElement(By.xpath("//span[contains(text(),'Blog')]")).click();
//		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//span[contains(text(),'Support')]")).click();
//		Thread.sleep(1000); 
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Projects')]")).click();
//		Thread.sleep(1000); 
//	
//		driver.findElement(By.xpath("//span[contains(text(),'Documentation')]")).click();
//		Thread.sleep(1000); 
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();
//		Thread.sleep(1000); 
//		
//		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
//		Thread.sleep(1000); 
//		
//		driver.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[2]/div[1]/a[1]")).click();
//		Thread.sleep(1000); 
		
//		driver.findElement(By.xpath("//*[@id='Layer_1']")).click();
//		Thread.sleep(1000); 
		
//		driver.findElement(By.xpath("//body/div[1]/main[1]/div[10]/div[1]/div[1]/form[1]/input[3]")).click();
//		Thread.sleep(1000); 
		
		driver.findElement(By.xpath("//body/div[1]/main[1]/div[6]/div[2]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(5000); 
		
		
	}
}
