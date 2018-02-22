package com.TestNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void LogIn()
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		Sleeper.sleepTightInSeconds(10);
		
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
