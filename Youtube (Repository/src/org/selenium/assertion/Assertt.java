package org.selenium.assertion;

import org.openqa.selenium.WebElement;

public class Assertt {
	
	public static void assert_equal(String actual, String expected)
	{
		if(actual.equals(expected))
		{
			System.out.println("Assertion Pass");
		}
		else
		{
			System.out.println("Assertion Fail");
		}
	}
	
	public static void assert_display(WebElement button)
	{
		if(button.isDisplayed())
		{
			System.out.println("WebElement Assertion Pass");
		}
		else
		{
			System.out.println("WebElement Assertion fail");
		}
	}

}
