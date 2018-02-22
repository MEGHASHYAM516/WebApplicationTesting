package com.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_Hover_Myntra {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.myntra.com");
		WebElement Men=driver.findElement(By.linkText("Men"));
		Actions act = new Actions(driver);
		act.moveToElement(Men).perform();
		//Sleeper.sleepTightInSeconds(4);
		driver.findElementByLinkText("Jackets");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
