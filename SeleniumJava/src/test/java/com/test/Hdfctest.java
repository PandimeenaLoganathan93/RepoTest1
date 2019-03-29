package com.test;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Hdfctest {
	@Test
	public void testNetbank() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
			driver.findElement(By.id("loginsubmit")).click();
			String home=driver.getWindowHandle();
		Set<String> set= driver.getWindowHandles();
		for(String s:set)
		
		{
			System.out.println(s);
		}
		Object[] obj=set.toArray();
		
		driver.switchTo().window(obj[1].toString());
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(By.name("login_page")));
		driver.findElement(By.cssSelector("img[alt='continue']")).click();
		if(ExpectedConditions.alertIsPresent()!=null)
		{
			Alert al = driver.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
			
		}
			
		driver.findElement(By.name("fldLoginUserId")).sendKeys("123654");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("img[alt='continue']")).click();
		Thread.sleep(10000);
		driver.close();
		//driver.close(); no such window exception
		driver.switchTo().window(home);
		Thread.sleep(10000);
		driver.close();
		//driver.quit(); close all window
		
}
}