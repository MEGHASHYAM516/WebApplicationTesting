package com.CapturingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle_Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");

		System.out.println("The below statement will print the the of the Facebook as Output");
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
