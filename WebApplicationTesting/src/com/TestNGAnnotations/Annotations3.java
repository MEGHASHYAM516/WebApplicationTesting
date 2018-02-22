package com.TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3
{

	
	@BeforeMethod
	public void BrowerLaunchAndLogIn()
	{
		System.out.println("THis is used to Launch Browser and login");
	}
	
	@Test(priority=1)
	public void InBox()
	{
		System.out.println("THi is used to tst InBox Functionality");
	}
	
	@Test(priority=2)
	public void CompoiseMail()
	{
		System.out.println("This is used to tst composeMail functionality");
	}
	
	@AfterMethod
	public void ApplicationClose()
	{
		System.out.println("This is used to close the application");
	}
	
	

}
