package com.TestNG;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NavigatingToGmail 
{
	@Test
	public void NavigateGmail()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");	
		driver.close();
		
		
	}

}
