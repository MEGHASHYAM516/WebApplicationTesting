package com.Validating_Gmail_Title;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Validating_Gmail_Title {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		
		String ExpectedTitle="Gmail";
		String ActualTitle=driver.getTitle();
		
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
		System.out.println("TEST PASS");	
		}
		else
		{
			System.out.println("FAIL");
		}
			

		driver.close();
	}

}
