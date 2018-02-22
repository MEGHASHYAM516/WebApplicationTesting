package com.BrowserAutomation;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEAutomation {

	public static void main(String[] args)
	{
		/*System.setProperty("webdriver.ie.driver", "c:\\IEDriverServer.exe");
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com"); */
		
		System.setProperty("webdriver.edge.driver", "c:\\MicrosoftWebDriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://google.com");
		
		driver.close();

	}

}
