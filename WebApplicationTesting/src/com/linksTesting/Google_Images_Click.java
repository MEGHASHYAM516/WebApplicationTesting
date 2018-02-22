package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Images_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Images")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
