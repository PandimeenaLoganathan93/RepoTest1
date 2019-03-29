package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Googleplay {
	@Test
	public void testgoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in/");
		driver.findElement(By.cssSelector("a[title='Google apps']")).click();
		WebElement ul = driver.findElement(By.xpath("//div[@aria-lavbel='Google apps']/ul"));
		List<WebElement> list=ul.findElements(By.tagName("li"));
		
		for(WebElement e: list)
		{
			if(e.getText().contains("Play"))
			{
				e.click();
			}
		}
		//driver.findElement(By.xpath("//a[@id='gb78']/span[1]")).click();
		//driver.findElement(By.cssSelector("div[aria-label='Google apps']>ul>*:nth-child(5)")).click();
	
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title,"Google Play");
	System.out.println("continues");
	driver.findElement(By.partialLinkText(" Books ")).click();
	}


}
