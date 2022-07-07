package com.bridgelabz;

public class EmployeeWageComputation {
	public static void main(String args[])
    {
        final int part_time = 1;
        final int full_time = 2;
        final int WAGE_PER_HR = 20;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HRS = 100;

        int totalwage = 0;
        int workinghrs = 0;
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
        for (int day = 1, totalworkinghrs = 0; day <= MAX_WORKING_DAYS
                && totalworkinghrs < MAX_WORKING_HRS; day++, totalworkinghrs += workinghrs)
        {

            int emptype = (int) (Math.random() * 100) % 3;
            switch (emptype)
            {
            case full_time:
                workinghrs = 8;
                break;
            case part_time:
                workinghrs = 4;
                break;
            default:
                workinghrs = 0;
                break;
            }
            int wage = workinghrs * WAGE_PER_HR;
            totalwage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workinghrs, wage, totalworkinghrs + workinghrs);

        }
        System.out.println("Total wage for a month is " + totalwage);
    }

}
