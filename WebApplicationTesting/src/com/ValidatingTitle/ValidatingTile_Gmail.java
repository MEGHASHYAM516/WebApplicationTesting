package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTile_Gmail {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		String ExpectedTitle="Gmail"; // Client REquirement Expected Title
		
		String ActualTitle=driver.getTitle(); // Developer given title
		
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title matched -- PASS");
		}
		else
		{
			System.out.println("Title not matched -- FAIL");
		}
			

		driver.close();
	}

}
