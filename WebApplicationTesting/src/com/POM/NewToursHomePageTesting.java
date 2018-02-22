package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePageTesting
{
	@Test
	public void HomePageTesting()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelcomeMercuryTours Shyam = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		Shyam.Register();
		driver.navigate().back();
		
		Shyam.Contact();
		driver.navigate().back();
		
		Shyam.LogInTest("tutorial", "tutorial");
		driver.navigate().back();
		
		driver.close();
	}
}
