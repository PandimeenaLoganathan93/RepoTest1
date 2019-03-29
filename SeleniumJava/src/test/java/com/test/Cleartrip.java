package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Cleartrip {
	@Test
	public void testtrip() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/flights");
		WebElement from=driver.findElement(By.id("FromTag"));
		Actions a1= new Actions(driver);
		a1.keyDown(from, Keys.SHIFT).sendKeys(from,"h").perform();
		Thread.sleep(5000);
		a1.sendKeys("y");
		Thread.sleep(5000);
		a1.sendKeys("d");
		Thread.sleep(5000);
		
		
		
		
	}

}
