package org.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.selenium.base.Base;
import org.selenium.pom.Login;
import org.testng.annotations.Test;

public class TCR2 extends Base {
	
	@Test
	public void clickSubscriptions() throws InterruptedException
	{
		Login I = new Login(driver,pr);
		I.enterDetails();
		
		/*Thread.sleep(5000);
		WebElement hamburger = driver.findElementByXPath("//yt-icon[@id='guide-icon']");
		hamburger.click();*/
		
		Thread.sleep(2000);
		WebElement subscription = driver.findElement(By.xpath(pr.getProperty("Subscription")));
		subscription.click();
	}

}
