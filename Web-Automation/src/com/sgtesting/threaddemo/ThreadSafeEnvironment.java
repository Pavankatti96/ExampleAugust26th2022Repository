package com.sgtesting.threaddemo;
class MyThread2 implements Runnable
{
	public void run()
	{
		displayEvenNumbers();
	}
	synchronized void displayEvenNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName()+"Even Numbers :"+i);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class ThreadSafeEnvironment {

	public static void main(String[] args) {
		MyThread2 job=new MyThread2();
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);
		t1.setName("alpha");
		t2.setName("omaega");
		t1.start();
		t2.start();

	}

}
