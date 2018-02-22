package com.TestNGAnnotations;

import org.testng.annotations.Test;

public class Annotations1
{

	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This is used to launch Browser");
	}
	
	@Test(priority=2)
	public void LogIn()
	{
		System.out.println("This is used to test LOgIn Functionality");
	}
	
	
	@Test(priority=3)
	
	public void ComposeMail()
	{
		System.out.println("Thi is used to tst Compose mail functionality");
	}
}
