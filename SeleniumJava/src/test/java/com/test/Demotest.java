package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.Testall;
public class Demotest {
	@Test
	public void testdemo()
	{
		WebDriver driver= new Testall().getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
//		WebElement email=driver.findElement(By.id("Email"));
//		email.sendKeys("askmail@email.com");
//		WebElement password =driver.findElement(By.id("Password"));
//		password.sendKeys("abc123");
//		WebElement login = driver.findElement(By.cssSelector("Input[value='Log in']"));
//		login.click();
//	     Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
//	     
	     
		WebElement reg = driver.findElement(By.linkText("Register"));
		reg.click();
		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.click();
		firstname.sendKeys("Meena");
		WebElement lastname = driver.findElement(By.id("LastName"));
		lastname.click();
		lastname.sendKeys("Bharathi");
		WebElement email = driver.findElement(By.id("Email"));
		email.click();
		email.sendKeys("meenaloganathan33@gmail.com");
		WebElement pwd = driver.findElement(By.id("Password"));
		pwd.click();
		pwd.sendKeys("meena@123");
		WebElement cpwd = driver.findElement(By.id("ConfirmPassword"));
		cpwd.click();
		cpwd.sendKeys("meena@123");
		WebElement regfinal = driver.findElement(By.cssSelector("Input[value='Register']"));
		regfinal.click();
		String result = driver.findElement(By.className("result")).getText();
		Assert.assertTrue(result.contains("Your registration completed"));
		System.out.println("pass");
	}

}
