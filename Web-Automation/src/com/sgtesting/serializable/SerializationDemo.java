package com.sgtesting.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		writeObjectInToFile();
	}
	
	private static void writeObjectInToFile()
	{
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		Employee obj=null;
		try
		{
			fout=new FileOutputStream("F:\\EXAMPLE\\Employee.ser");
			out=new ObjectOutputStream(fout);
			obj=new Employee("Santosh",7211,"Manager",8500);
			
			out.writeObject(obj);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				out.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}

