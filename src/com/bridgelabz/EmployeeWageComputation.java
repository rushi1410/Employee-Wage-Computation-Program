package com.bridgelabz;

public class EmployeeWageComputation {
	public static void main(String args[])
    {
        final int part_time = 1;
        final int full_time = 2;
        final int WAGE_PER_HR = 20;
        int emptype = (int) (Math.random() * 100) % 3;
        int workinghours =0;
        switch (emptype)
        {
            case full_time:
                System.out.println("Employee is Present Full time");
                workinghours = 8;
                break;
            case part_time:
                System.out.println("Employee is Present Part time");
                workinghours = 4;
                break;
            default:
                System.out.println("Employee is Absent");    
        }
        int wage = workinghours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}
