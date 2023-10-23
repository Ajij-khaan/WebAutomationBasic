package com.shay.Web_Automation_Baics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExample {
	
	@Test (priority = 1)
	public void testa() {
		System.out.println("testa.................");
	}
	
	@Test (priority = 0)
	public void testz() {
		System.out.println("testz.................");
	}
	
	@Test (priority = 2)
	public void masud() {
		System.out.println("masud.................");
	}
	
	@BeforeSuite
	public void beforeSuitExample() {
		System.out.println("Beforsuit execute first");
	}
	
	@BeforeTest // eta before suit er pore run hobe ar baki sob norma method er age run hobe
	public void beforeTestExample() {
		System.out.println("BeforeTest execute");
	}
	
	@BeforeClass // eta ei class e joto normal method thakbe tader age run korbe bt before test er pore.
	public void beforeClassExample() {
		System.out.println("Before Class execute ");
	}
	
	@BeforeMethod // joto before ase sobar last e eta run hobe
	public void beforeMethodExample() {
		System.out.println("Before Method execute ");
	}
	
	@AfterMethod // joto after ase sobar age eta run hobe. orthat maain test er porei eta runhoye jabe
	public void AfterMethodExample() {
		System.out.println("After Method execute ");
	}
	
	@AfterClass // eta normal method run houar pore run hobe
	public void AfterClassExample() {
		System.out.println("After Class execute first");
	}
	
	@AfterTest
	public void AfterTestExample() {
		System.out.println("After Test execute first");
	}
	
	@AfterSuite //eta test sesh   
	public void afterSuitExample() {
		System.out.println("Aftersuit execute in last");
	}
	
}
