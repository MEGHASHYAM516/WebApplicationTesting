package com.TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 
{

	@BeforeTest
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
	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("This is used to close the application");
	}
	
	
}
