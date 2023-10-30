package com.shay.Web_Automation_Baics;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.awt.AWTException;
import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TabWindowIncognitoExample extends BaseDriver {
	String url = "https://google.com";

	
	@Test
	public void IncognitoWindowTest() throws InterruptedException, AWTException {

		driver.manage().window().maximize();
		
		/*
		//Ei process kaj korena. amar vabte pari evabe kaj krbe bt actually kore na tai amra eta use korbo na.
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL);
		action.keyDown(Keys.SHIFT);
		action.sendKeys("n");
		action.build().perform();
		Thread.sleep(5000);
		

		action.keyUp(Keys.CONTROL);
		action.keyUp(Keys.SHIFT);
		action.build().perform();
		*/


		/*Robot er sahajjye amra copy pase new tab etc open korte pari.
		 * Roboter khetre age presse kore tarpor release kore dite hobe
		 * tobe ekhetre release korle ultodik theke release kore jete hobe
		 */
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_N);
		robot.delay(100);
		
		robot.keyRelease(KeyEvent.VK_N);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.switchTo().window(windowHandle().get(1));
		driver.get(url);
		Thread.sleep(2000);
		
		driver.switchTo().window(windowHandle().get(0));
		String secondURL = "https://daraz.com.bd";
		driver.get(secondURL);
		Thread.sleep(3000);
	}
	
	//Windows handle korar jonno that means joto gula active window/tab open hobe sob gular info set er 
	//moddhe stroe thakbe. tarpor setake array akare list erm moddhe rekhe debo and jokhn dorkar lagbe
	//tkhn just number diy eacces skorte parbo.  ekhetre kon windows koto number e open hoyeche ta
	//mone rakhte hobe
	public List<String> windowHandle() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandleList = new ArrayList<String> (windowHandles);
		return windowHandleList;
	}
}
