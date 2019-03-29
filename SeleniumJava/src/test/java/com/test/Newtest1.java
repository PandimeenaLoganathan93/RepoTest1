package com.test;
//testing using testng
import org.testng.annotations.Test;

public class Newtest1 {
	@Test(priority=1)
	public void google()
	{
		System.out.println("Google");
	}
	
	@Test(priority=2)
	public void accenture()
	{
		System.out.println("Accenture");
	}

}
///priority based on output alphabetical order