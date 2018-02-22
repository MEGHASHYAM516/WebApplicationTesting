package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatingToGmail {

	public static void main(String[] args) 
	{
		FirefoxDriver shyam = new FirefoxDriver();
		shyam.get("http://www.gmail.com");
		
		shyam.navigate().to("http://facebook.com");
		
		shyam.close();
				

	}

}
