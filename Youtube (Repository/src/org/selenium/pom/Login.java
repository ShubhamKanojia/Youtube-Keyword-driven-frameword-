package org.selenium.pom;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	
	ChromeDriver driver;
	Properties pr;
	
	public Login(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	
public void enterDetails() throws InterruptedException
{
	WebElement signIn = driver.findElement(By.xpath(pr.getProperty("Signin")));
	signIn.click();
	
	WebElement emailorphone = driver.findElement(By.xpath(pr.getProperty("emailorphone")));
	emailorphone.sendKeys("test.sele01@gmail.com");
	
	/* WebElement next = driver.findElementByXPath("//span[@class='RveJvd snByac']");
	next.click(); */
	
	Actions ac = new Actions(driver);
	ac.sendKeys(Keys.ENTER).perform();
	
	Thread.sleep(1000);
	
	WebElement password = driver.findElement(By.xpath(pr.getProperty("pass")));
	password.sendKeys("qwertyui12");
	
	ac.sendKeys(Keys.ENTER).perform();
	
}

}
