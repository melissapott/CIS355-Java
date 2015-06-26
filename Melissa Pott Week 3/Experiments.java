//File:  Experiments.java
//Melissa Pott
//March 26, 2006
//CIS355
//Week 3 Homework component

import javax.swing.*; //required for messagebox functionality

public class Experiments //declare class
{
	
	public static void main(String[] args)
	{
		//declare constants
		final int NUMEXPERIMENTS = 4;
		final int NUMTESTS = 6;
		
		//declare variables
		int count1, count2;
		String s1;
		double result, total, average;
		
		//construct a loop that will repeat until the value of NUMEXPERIMENTS
		//is reached, incrementing counter by one
		for(count1 = 1; count1 <= NUMEXPERIMENTS; count1++)
		{
			total = 0;//initialize total to zero
			
			//construct a loop that will repeat until the value of NUMTESTS
			//is reached, incrementing counter by one
			for(count2 = 1; count2 <= NUMTESTS; count2++)
			{
				//prompt for user input, and accept into s1 variable
				s1 = JOptionPane.showInputDialog("Enter a test result:");
				result = Double.parseDouble(s1);//convert string to double
				total = total + result;//accumulate total
			}
			
			average = total / NUMTESTS;//calculate total divided by NUMTESTS constant
			
			//display result
			JOptionPane.showMessageDialog(null, "The average for experiment " +
				count1 + " is: " + average, "Experiments", JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		
	}
	
}