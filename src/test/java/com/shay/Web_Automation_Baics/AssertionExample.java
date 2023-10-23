package com.shay.Web_Automation_Baics;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertionExample extends BaseDriver{
	String url = "https://www.alibaba.com/";
	
	@Test (priority = 0)
	public void assertionTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String actualTitle = "libaba.com: Manufacturers, Suppliers, Exporters & Importers from the world's largest online B2B marketplace";
		String title = driver.getTitle();
//		System.out.println(title);
		
		/* jokhn amra caibo je kono test faield hole ar rest of the code runkorbe na tkhn assertion
		 * use korbo. assertion dui prokar. hard assertion & soft assertion
		 * Hard assertion jekhane failed hobe er por theke code execute hobe na ar
		 * ar soft assertion jekhane failed hobe er poro run hobe and output dekhabe   
		 * jar priority beshi like title heading required esob test amra hard e rakhbo
		 * bakigula jegula pore solve korleo hobe segula soft assertion e e rakhbao 
		 */
		
		//Hard Assertion
//		Assert.assertEquals(actualTitle, title);
//		System.out.println("Mathced");
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualTitle, title);
		softAssert.assertAll();
		System.out.println("First Method ");
		
	}
//	
//	@Test (priority = 1)
//	public void secondTEst() {
//		System.out.println("secondTest");
//	}
//	
	
}
