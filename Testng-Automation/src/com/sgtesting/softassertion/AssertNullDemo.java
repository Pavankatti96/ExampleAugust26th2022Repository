package com.sgtesting.softassertion;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullDemo {
	
	@Test
	public void assertNullDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			File f1=null;
			obj.assertNull(f1);
			System.out.println("The assertNull Step has executed properly");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotNullDemo()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			File f1=null;
			f1=new File("D:\\EXAMPLE");
			obj.assertNotNull(f1);
			System.out.println("The assertNotNull Step has executed properly");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
