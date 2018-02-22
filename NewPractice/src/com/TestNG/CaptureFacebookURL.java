package com.TestNG;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaptureFacebookURL 
{
	FirefoxDriver driver;
	
	@BeforeTest
	public void FirefoxBrowserLaunch()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void GetTitleAndURL()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@AfterTest
	public void CloseFirefoxBrowser()
	{
		driver.close();
		
	}
	
	
	
	

}
