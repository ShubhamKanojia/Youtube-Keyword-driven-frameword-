package org.selenium.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.selenium.assertion.Assertt;
import org.selenium.base.Base;
import org.selenium.pom.Login;
import org.selenium.utils.Logss;
import org.selenium.utils.Screenshott;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCR1 extends Base {
	
	@Test
	public void loginAndClickTrending() throws InterruptedException, IOException
	{
		/*
		Thread.sleep(5000);
		WebElement hamburger = driver.findElementByXPath("//yt-icon[@id='guide-icon']");
		hamburger.click(); 
		*/
		
		//String expected_url = "https://www.youtube.com/feed/trending";
		
		Login I = new Login(driver,pr);
		I.enterDetails();
		
		Logss.take_logs("Successfull login", "TCR1");
		
		Thread.sleep(2000);
		WebElement trending = driver.findElement(By.xpath(pr.getProperty("Trending")));
		trending.click();
		
		Logss.take_logs("Clicked trending", "TCR1");
		
		Screenshott.take_screenshot("D:\\trending.png", driver);
		
		Logss.take_logs("Trending screenshot taken", "TCR1");
		
		//String actual_url = driver.getCurrentUrl();
		
		/*Hard assertions:-
		Assert.assertEquals(actual_url, expected_url);*/
		/*WebElement trending = driver.findElement(By.xpath("//span[text()='Trending']");
		Assert.assertTrue(trending.isDisplayed());*/
		
		Assertt.assert_display(trending);
	}

}
