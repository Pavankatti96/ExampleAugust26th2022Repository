package com.sgtesting.serializable;

import java.io.Serializable;

public class Employee implements Serializable{
	
	String firstname;
	int empno;
	String jobname;
	int salary;
	
	public Employee(String firstname,int empno,String jobname,int salary)
	{
		this.firstname=firstname;
		this.empno=empno;
		this.jobname=jobname;
		this.salary=salary;
	}
	public void showFN()
	{
		System.out.println("First Name :"+firstname);
	}
	
	public void showJobName()
	{
		System.out.println("Job Name :"+jobname);
	}
	
	public void showEmpNo()
	{
		System.out.println("Employee Number :"+empno);
	}

	public void showSalary()
	{
		System.out.println("Salary :"+salary);
	}
}

