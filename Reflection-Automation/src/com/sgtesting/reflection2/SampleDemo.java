package com.sgtesting.reflection2;
import java.lang.reflect.Method;
import com.sgtesting.reflection1.Sample;
public class SampleDemo {

	public static void main(String[] args) {
		try
		{
			Sample obj=new Sample();
			Method method[]=obj.getClass().getMethods();
			
			for(int i=0;i<method.length;i++)
			{
				String methodname=method[i].getName();
				if(methodname.startsWith("display"))
				{
					method[i].invoke(obj);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

