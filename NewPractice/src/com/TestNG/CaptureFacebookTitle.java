package com.TestNG;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaptureFacebookTitle 
{
	

	FirefoxDriver driver;
	
	@BeforeTest
	public void BrowserLaunch()
	{
		 driver = new FirefoxDriver();
		driver.get("http://facebookcom");
	}
	
	
	@Test
	public void PrintAndGetTitle()
	{
		System.out.println("The below statement will print Facebook as Output");
		System.out.println(driver.getTitle());
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	

}
