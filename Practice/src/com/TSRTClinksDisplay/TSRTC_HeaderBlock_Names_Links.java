package com.TSRTClinksDisplay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderBlock_Names_Links {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in");
		
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderBlockLinks.size());
		
		for (int i=0;i<HeaderBlockLinks.size();i++)
			{
			
			
			
			
			//System.out.println(i);
			
			System.out.println(i+"  "+HeaderBlockLinks.get(i).getText());
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			HeaderBlock=driver.findElement(By.className("menu-wrap"));
			
		}
		driver.close();
		
		

	}

}
