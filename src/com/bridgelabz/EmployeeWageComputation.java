package com.bridgelabz;

public class EmployeeWageComputation {
	 public static void main(String args[])
	    {
	        final int full_time = 1;
	        final int WAGE_PER_HR = 20;
	        int emptype = (int) (Math.random() * 100) % 2;
	        int workinghours = 0;
	        if (emptype== full_time)
	        {
	            System.out.println("Employee is Present");
	            workinghours = 8;
	        } else
	        {
	            System.out.println("Employee is Absent");
	        }
	        int wage = workinghours * WAGE_PER_HR;
	        System.out.println("Employee Daily Wage is " + wage);
	    }
}
