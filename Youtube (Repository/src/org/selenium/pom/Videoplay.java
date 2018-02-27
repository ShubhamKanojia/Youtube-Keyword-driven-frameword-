package org.selenium.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Videoplay {
	
	ChromeDriver driver;
	public Videoplay(ChromeDriver driver)
	{
		this.driver=driver;
	}

	public void video()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> all = driver.findElementsByXPath("//a[@id='video-title']");
		all.get(2).click();
	}
}
