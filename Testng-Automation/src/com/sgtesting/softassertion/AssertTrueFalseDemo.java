package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTrueFalseDemo {

	@Test
	public void assertTrueDemo() {
		try {
			SoftAssert obj=new SoftAssert();
			int x, y;
			x = 75;
			y = 50;
			obj.assertTrue(x >= y);
			System.out.println("The assertTrue Step has executed properly");
			obj.assertAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void assertFalseDemo() {
		try {
			SoftAssert obj=new SoftAssert();
			int x, y;
			x = 75;
			y = 50;
			obj.assertFalse(x <= y);
			System.out.println("The assertFalse Step has executed properly");
			obj.assertAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

