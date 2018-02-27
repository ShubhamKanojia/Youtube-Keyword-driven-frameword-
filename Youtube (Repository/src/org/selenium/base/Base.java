package org.selenium.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public ChromeDriver driver;
	public Properties pr;
	
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		File f = new File(".//OR.properties");
		FileInputStream fi = new FileInputStream(f);
		pr = new Properties();
		pr.load(fi);
			
		
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("AfterMethod");
	}

}
