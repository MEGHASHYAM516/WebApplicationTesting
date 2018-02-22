package com.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewUserRegistrations 
{
    FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	}
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		
		Sleeper.sleepTightInSeconds(10);
	}
	
	@Test(priority=2)
	public void UserRegistration()
	{
		driver.findElement(By.name("firstName")).sendKeys("Shyam");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.id("userName")).sendKeys("Shyam@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Hno:123");
		driver.findElement(By.name("city")).sendKeys("HYD");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500054");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.id("email")).sendKeys("Shyaaaam");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		driver.findElement(By.name("register")).click();
		
		String ExpectedUserName="Shyaaaam";
		
		String UserRegisteredMessage=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		if(UserRegisteredMessage.contains(ExpectedUserName))
		{
			System.out.println("User Registered Successfullu -- PASS");
		}
		else
		{
			System.out.println("User Registrations Failed -- FAIL");
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	
	
}
