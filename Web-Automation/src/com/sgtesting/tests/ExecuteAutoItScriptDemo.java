package com.sgtesting.tests;

public final class ExecuteAutoItScriptDemo {

	public static void main(String[] args) {
		executeDemo();
	}
	
	private static void executeDemo()
	{
		try
		{
		//	Runtime.getRuntime().exec("E:\\GitRepository\\SecondTestScriptSaveFile.exe");
			Runtime obj=Runtime.getRuntime();
			obj.exec("E:\\GitRepository\\SecondTestScriptSaveFile.exe");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

