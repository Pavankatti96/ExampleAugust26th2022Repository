package com.sgtesting.reflection6;

import java.lang.reflect.Method;

public class ReflectionWithParamtersDemo {

	public static void main(String[] args) {
		executeDemo();

	}
	
	private static void executeDemo()
	{
		CustomerDetails obj=null;
		try
		{
			obj=new CustomerDetails();
			//parameters for two String paramters
			Class strparam1[]=new Class[2];
			strparam1[0]=String.class;
			strparam1[1]=String.class;
					
			Method method1=obj.getClass().getMethod("getPersonDetails", strparam1);
			method1.invoke(obj, new String("Sachin"),new String("Mumbai"));
			
			//Parameter of Integer Type
			Class[] intparam=new Class[1];
			intparam[0]=Integer.TYPE;
			
			Method method2=obj.getClass().getMethod("displayEmpNumber", intparam);
			method2.invoke(obj, 7210);
			
			//Paramter of one String parameter
			Class strparam2[]=new Class[1];
			strparam2[0]=String.class;
			
			Method method3=obj.getClass().getMethod("showStateName", strparam2);
			method3.invoke(obj, new String("Karantaka"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
