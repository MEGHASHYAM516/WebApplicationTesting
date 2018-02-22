package com.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAllLinksOfNewTourWebsite 
{
	FirefoxDriver driver;

	
	
	@BeforeMethod
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	}
	
	@Test(priority=1)
	public void FindLinks()
	{
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int a=0;a<links.size();a++)
	{
		String LinkName=links.get(a).getText();
		System.out.println(a+" "+LinkName);
		links.get(a).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		Sleeper.sleepTightInSeconds(5);
		links=driver.findElements(By.tagName("a"));
		
		
	}
	}
	
	
	@AfterMethod
	
	public void tearDown()
	{
	driver.close();
	

}
}