package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Creditcards {
	@Test
	public void testCredit() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(10000);
	
		//driver.switchTo().frame(driver.findElement(By.id("vizury-notification-template")));
		//driver.findElement(By.id("div-close")).click();
		Actions act1= new Actions(driver);
		act1.moveToElement(driver.findElement(By.linkText("Products"))).perform();
		Thread.sleep(5000);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/cards']"))).perform();
		Thread.sleep(5000);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/cards/credit_cards']"))).click().perform();
		//driver.findElement(By.linkText("Products"));
		Assert.assertTrue(driver.getCurrentUrl().contains("cards"));
	}
}
