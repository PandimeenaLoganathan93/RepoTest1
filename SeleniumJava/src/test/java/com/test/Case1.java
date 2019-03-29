package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case1 {
@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("mensbhar123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("meens123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String logout=driver.findElement(By.linkText("Log out")).getText();
		Assert.assertEquals(logout, "Log out");
		
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		driver.findElement(By.linkText("Casual Golf Belt")).click();
		driver.findElement(By.id("addtocart_40_EnteredQuantity")).clear();
		driver.findElement(By.id("addtocart_40_EnteredQuantity")).sendKeys("10");
		driver.findElement(By.id("add-to-cart-button-40")).click();
		String quantity = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[2]")).getText();
		System.out.println(quantity);
		
	}


}
