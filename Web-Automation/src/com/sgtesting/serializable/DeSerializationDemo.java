package com.sgtesting.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) {
		readObjectFromFile();

	}
	
	private static void readObjectFromFile()
	{
		FileInputStream fin=null;
		ObjectInputStream in=null;
		Employee obj=null;
		try
		{
			fin=new FileInputStream("F:\\EXAMPLE\\Employee.ser");
			in=new ObjectInputStream(fin);
			obj=(Employee) in.readObject();
			
			obj.showFN();
			obj.showJobName();
			obj.showEmpNo();
			obj.showSalary();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				in.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

