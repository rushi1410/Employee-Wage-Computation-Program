package com.bridgelabz;

public class EmployeeWageComputation {
	public static void main(String[] args) 
	{
		final int full_time = 1;
		int emptype = (int) (Math.random()* 100) % 2;
		if (emptype == full_time)
		{
			System.out.println("employee is present");
		}
		else
		{
			System.out.println("emplyee is absent");
		}
		
	}

}
