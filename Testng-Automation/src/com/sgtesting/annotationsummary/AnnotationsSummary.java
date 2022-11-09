package com.sgtesting.annotationsummary;

import org.testng.annotations.*;

public class AnnotationsSummary {
	
	@Test
	public void method1()
	{
		System.out.println("This is @Test Annotation method1");
	}
	
	@Test
	public void method2()
	{
		System.out.println("This is @Test Annotation method2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is @BeforeMethod Annotation method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is @AfterMethod Annotation method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is @BeforeClass Annotation method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is @AfterClass Annotation method");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is @BeforeTest Annotation method");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is @AfterTest Annotation method");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is @BeforeSuite Annotation method");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is @AfterSuite Annotation method");
	}

}

