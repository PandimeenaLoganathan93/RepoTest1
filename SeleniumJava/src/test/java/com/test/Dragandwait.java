package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dragandwait {
	@Test
	public void dragwaittest() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
		WebElement from=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
		WebElement to=driver.findElement(By.id("ctl00_ContentPlaceholder1_priceChecker"));
		
		Actions act1= new Actions(driver);
		act1.dragAndDrop(from, to).perform();
		//Thread.sleep(5000); =--static wait
		
		/* dyanamic*/
		WebDriverWait w =new WebDriverWait(driver,10);
		w.until(ExpectedConditions.invisibilityOfElementWithText(By.id("ctl00_ContentPlaceholder1_priceChecker"), "Drop a package here to check price"));
		
		String a=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
		System.out.println(a);
		Assert.assertTrue(a.contains("$"));
		
		
	}

}
