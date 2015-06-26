//File:  Salary.java
//Melissa Pott
//March 26, 2006
//CIS355
//Week 3 Homework component

import java.io.*; //required for input output functionality

public class Salary //declare the class
{
	
	public static void main(String[] args)
	throws java.io.IOException //required for input output functionality
	{
		//declare constants
		final int FULLTIME = 40;
		final double PAY_PER_HOUR = 8.00;
		final double OVERTIME_PAY = 12.00;
		
		//declare variables
		String s1;
		double salary;
		int hours;
		
		//create instance of stream reader class and 
		//buffered reader class to accept input
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//prompt user for input
		System.out.print("Enter the number of hours worked: ");
		s1 = br.readLine(); //read user input into s1 variable
		hours = Integer.parseInt(s1); //convert input into a double
		
		if (hours <= FULLTIME) //test if hours entered is more or less than 40
			salary = hours * PAY_PER_HOUR; //if 40 or less, multiply hours by pay rate
		else 
			//if hours are more than 40, calculate regular pay plus overtime pay
			salary = (FULLTIME * PAY_PER_HOUR) + (hours - FULLTIME) * OVERTIME_PAY;
		
		System.out.println("Salary = " + salary);//display result
	}
}