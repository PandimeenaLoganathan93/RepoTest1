package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Newtest2 {
	@Test
	public void testgoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in/");
		driver.findElement(By.cssSelector("a[title='Google apps']")).click();
		//driver.findElement(By.xpath("//a[@id='gb78']/span[1]")).click();
		driver.findElement(By.cssSelector("div[aria-label='Google apps']>ul>*:nth-child(5)")).click();
	
		
		//anything getting from UI -will start with get
	String title=driver.getTitle();
	System.out.println(title);
		
//		if (title.equals("Goo"))
//		{
//			System.out.println("Passed");
//		}
//		else
//		{
//			System.out.println("Failed");
//		}
//		System.out.println("continues");
		
		
//		Assert.assertEquals(title, "Google Play");
//		System.out.println("continues");
	}

}
