package com.Google1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Google1 {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("password");
		
		
		Sleeper.sleepTightInSeconds(4);

		driver.findElementByLinkText("login").click();
		
		
		driver.close();
		
		
	}

}
