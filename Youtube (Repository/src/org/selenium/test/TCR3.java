package org.selenium.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.selenium.base.Base;
import org.selenium.pom.Login;
import org.selenium.pom.Videoplay;
import org.testng.annotations.Test;

public class TCR3 extends Base{
	
	@Test
	public void videoPlay() throws InterruptedException
	{
		Login I = new Login(driver,pr);
		I.enterDetails();
		
		Videoplay p = new Videoplay(driver);
		p.video();
		
		WebElement like = driver.findElementByXPath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']");
		like.click();
	}

}
