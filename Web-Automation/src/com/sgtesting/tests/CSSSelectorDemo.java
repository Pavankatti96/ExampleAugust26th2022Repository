package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteCSSSelector();
	//	relativeCSSUsingTagName();
	//	relativeCSSUsingTagNameWithIdAttributeValue();
	//	relativeCSSUsingIdAttributeValue();
	//	relativeCSSUsingTagNameWithClassAttributeValue();
	//	relativeCSSUsingClassAttributeValue();
	//	relativeCSSUsingTagNameWithAttributeNameValue();
	//	relativeCSSUsingTagNameWithMultipleAttributeNameValue();
	//	relativeCSSUsingTagNameWithPartialAttributeNameValue();
	//	relativeCSSUsingTagNameWithAttributeNameAlone();
	//	relativeCSSUsingTagNameWithAttributeNameAlone_1();
	//	relativeCSSUsingTagNameWithAttributeNameAlone_2();
	//	relativeCSSUsingParentElementReference();
	//	relativeCSSUsingnthChildConcept();
		relativeCSSUsingSiblingConcept();
	}
	
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///E:/HTML/Sample.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void absoluteCSSSelector()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 1: Identify the Element based on <tagName>
	 * Syntax: <tagName>
	 */
	private static void relativeCSSUsingTagName()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 2: Identify the Element based on <tagName> with <id attribute value>
	 * Syntax: <tagName>#<id attribute value>
	 */
	private static void relativeCSSUsingTagNameWithIdAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser2");
	}
	
	/**
	 * Case 3: Identify the Element based on  <id attribute value>
	 * Syntax: #<id attribute value>
	 */
	private static void relativeCSSUsingIdAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser2");
	}
	
	/**
	 * Case 4: Identify the Element based on <tagName> with <class attribute value>
	 * Syntax: <tagName>.<class attribute value>
	 */
	private static void relativeCSSUsingTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUser2");
	}
	
	/**
	 * Case 5: Identify the Element based on <class attribute value>
	 * Syntax: .<class attribute value>
	 */
	private static void relativeCSSUsingClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser3");
	}
	
	/**
	 * Case 6: Identify the Element based on  <tagName> with attribute name and value combination
	 * Syntax: <tagName>[attributename='attributevalue']
	 */
	private static void relativeCSSUsingTagNameWithAttributeNameValue()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
	}
	
	/**
	 * Case 7: Identify the Element based on  <tagName> with Multiple attribute name and value combination
	 * Syntax: <tagName>[attributename='attributevalue'][attributename='attributevalue']
	 */
	private static void relativeCSSUsingTagNameWithMultipleAttributeNameValue()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit'][name='submit1btn1']")).click();
	}
	
	/**
	 * Case 8: Identify the Element based on  <tagName> with partial matching of attribute name and value combination
	 * Syntax: 
	 * <tagName>[attributename ^= 'attributevalue']    starts-with
	 * <tagName>[attributename $= 'attributevalue']    ends-with
	 * <tagName>[attributename *= 'attributevalue']    contains
	 */
	private static void relativeCSSUsingTagNameWithPartialAttributeNameValue()
	{
	//	oBrowser.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
		oBrowser.findElement(By.cssSelector("input[id *= 'submit1']")).click();
	}
	
	/**
	 * Case 9: Identify the Element based on <tagName> with attribute name
	 * Syntax: <tagName>[attributename]
	 */
	private static void relativeCSSUsingTagNameWithAttributeNameAlone()
	{
		//Find Number of links in a Web Page
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	
	private static void relativeCSSUsingTagNameWithAttributeNameAlone_1()
	{
		//Display All available Link Names
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linkname=link.getText();
			System.out.println(linkname);
		}
	}
	
	private static void relativeCSSUsingTagNameWithAttributeNameAlone_2()
	{
		//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: 
		// stale element reference: element is not attached to the page document
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linkname=link.getText();
			if(linkname.endsWith("HQ"))
			{
				link.click();
			}
		}
	}
	
	/**
	 * Case 10: Identify the Element based on  parent Element reference
	 * Syntax: <parentElement> > <childElement>
	 */
	private static void relativeCSSUsingParentElementReference()
	{
		oBrowser.findElement(By.cssSelector("form#frm2 > input")).click();
	}
	
	/**
	 * Case 11: Identify the Element based on  nth-child concept
	 * Syntax: nth-child(number)
	 */
	private static void relativeCSSUsingnthChildConcept()
	{
	//	oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(2)")).sendKeys("DemoUser123");
		oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(5)")).sendKeys("DemoUser555");
	}

	/**
	 * Case 12: Identify the Element based on  sibling concept
	 * Syntax: <parentElement> > <Sibling1> + <Sibling2> + <Sibling3>
	 */
	private static void relativeCSSUsingSiblingConcept()
	{
	//	oBrowser.findElement(By.cssSelector("form#frm3 > input + input + input")).sendKeys("DemoUser123");
		oBrowser.findElement(By.cssSelector("form#frm3 > input + input")).sendKeys("DemoUser123");
	}
}

