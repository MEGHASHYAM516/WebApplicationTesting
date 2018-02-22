package com.TourLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TourLoginTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("Tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		//Sleeper.sleepTightInSeconds(4);
		
		driver.findElement(By.name("login")).click();
		
		driver.close();
		

	}

}
