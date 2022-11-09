package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsDemo {
	
	@Test
	public void assertEqualsDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			String s1,s2;
			s1="JavaScript";
			s2="JavaScript";
			obj.assertEquals(s1, s2);
			System.out.println("The assertEquals Step has executed properly");
			obj.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void assertNotEqualsDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			String s1,s2;
			s1="JavaScript";
			s2="JavaScript";
			obj.assertNotEquals(s1, s2);
			System.out.println("The assertNotEquals Step has executed properly");
			obj.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}

