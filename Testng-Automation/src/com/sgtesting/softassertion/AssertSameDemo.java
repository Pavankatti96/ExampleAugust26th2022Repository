package com.sgtesting.softassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {
	
	@Test
	public void assertSameDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			String s1="Welcome";
			String s2=new String("Welcome");
			obj.assertSame(s1, s2);
			System.out.println("The assertSame Step has executed properly");
			obj.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotSameDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			String s1="Welcome";
			String s2=new String("WelcomeNew");
			obj.assertNotSame(s1, s2);
			System.out.println("The assertNotSame Step has executed properly");
			obj.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

