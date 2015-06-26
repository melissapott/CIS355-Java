//File:  CompareNumbers.java
//Melissa Pott
//March 26, 2006
//CIS355
//Week 3 Homework component

import java.io.*; //required for input output functionality

public class CompareNumbers //declare class
{
	public static void main(String[] args)
	throws java.io.IOException //required for input output functionality
	{
		//declare variables
		double firstNumber, secondNumber;
		String s1;
		
		//create instance of stream reader and buffered reader classes 
		//to accept user input
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//propmt user for input
		System.out.print("Enter a number: ");
		
		s1 = br.readLine(); //read input into s1 variable
		firstNumber = Double.parseDouble(s1);//convert string to double
		
		//propmt user for input
		System.out.print("Enter another number:");
		
		s1 = br.readLine();//read input into s2 variable
		secondNumber = Double.parseDouble(s1);//convert string to double
		
		
		if(firstNumber > secondNumber) //compare first number to second number
			//if firstnumber is greater, display the following output
			System.out.println("The first number is larger than the second");
		else
			//if first number is not greater, display the following output
			System.out.println("The first number is not larger than the second");
	}
}