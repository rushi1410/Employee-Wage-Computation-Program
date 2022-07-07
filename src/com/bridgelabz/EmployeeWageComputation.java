package com.bridgelabz;

public class EmployeeWageComputation {
	public static void main(String args[])
    {
        final int part_time = 1;
        final int full_time = 2;
        final int WAGE_PER_HR = 20;
        final int WORKING_DAYS = 20;
    
        int totalwage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++)
        {
            int emptype = (int) (Math.random() * 100) % 3;
            int workinghours =0;
            switch (emptype)
            {
                case full_time:
                    workinghours = 8;
                    break;
                case part_time:
                    workinghours = 4;
                    break;
                default:
            }
            int wage = workinghours * WAGE_PER_HR;
            System.out.println("Day " + day + " wage is:" + wage);
            totalwage += wage;
        }
        System.out.println("Total wage for a month is " + totalwage);        
    }

}
