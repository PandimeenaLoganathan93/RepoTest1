package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestIE {
//to test ie
//		@Test
//		public void testie()
//		{
//			System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe");
//			WebDriver driver = new InternetExplorerDriver();
//			driver.manage().window().maximize();
//		}
	@Test
	public void testall()
	{
		Testall a=new Testall();
		a.getDriver("ie");
	}

}