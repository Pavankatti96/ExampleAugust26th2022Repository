package com.sgtesting.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider="testdata")
	public void displayTestData(String user,String pwd)
	{
		System.out.println(user+ " ---> "+pwd);
	}
	
	@DataProvider(name="testdata")
	public Object[][] getTestData()
	{
		return new Object[][] {{"admin1","manager1"},
			{"admin2","manager2"},
			{"admin3","manager3"}};
	}

}
