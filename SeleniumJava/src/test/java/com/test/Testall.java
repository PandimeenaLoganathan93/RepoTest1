package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testall {
	
	public WebDriver getDriver(String browsename)
	{
if(browsename.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	return new ChromeDriver();
}
else if (browsename.equals("ie"))
{
	System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe");
    return new InternetExplorerDriver();
}
else
{
	return null;
}
}
}