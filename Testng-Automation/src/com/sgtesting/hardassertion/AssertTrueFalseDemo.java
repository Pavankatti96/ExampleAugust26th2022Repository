package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalseDemo {

	@Test
	public void assertTrueDemo() {
		try {
			int x, y;
			x = 75;
			y = 50;
			Assert.assertTrue(x >= y);
			System.out.println("The assertTrue Step has executed properly");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void assertFalseDemo() {
		try {
			int x, y;
			x = 75;
			y = 50;
			Assert.assertFalse(x <= y);
			System.out.println("The assertFalse Step has executed properly");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

