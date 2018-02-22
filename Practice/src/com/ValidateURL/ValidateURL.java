package com.ValidateURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateURL {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		String ExpectedURL="facebook.com";
		System.out.println(ExpectedURL);
		
		String ActualURL=driver.getCurrentUrl();
		System.out.println(ActualURL);
		
		if(ActualURL.contains(ExpectedURL))
		{
			System.out.println("TEST PASS");
			
		}
		else
		{
			System.out.println("TEST FAIL");
			
		}
		driver.close();
		
		

	}

}
