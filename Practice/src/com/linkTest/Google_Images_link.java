package com.linkTest;

import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Google_Images_link {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		//Sleeper.sleepTightInSeconds(3);

		
		driver.findElementByLinkText("Gmail").click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.close();

		
	}

}
