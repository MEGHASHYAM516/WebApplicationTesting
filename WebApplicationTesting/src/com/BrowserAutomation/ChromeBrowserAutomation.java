package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserAutomation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		driver.close();
		
		
	}

}