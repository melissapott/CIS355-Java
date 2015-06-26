//File:  Experiments2.java
//Melissa Pott
//March 26, 2006
//CIS355
//Week 3 Homework component

import javax.swing.*;//required for messagebox functionality

public class Experiments2 //declare class
{
	
	public static void main(String[] args)
	{
		final int NUMEXPERIMENTS = 4; //declare constants
		
		//declare variables
		int count1, count2;
		String s1;
		double result, total, average;
		
		//create loop that will repeat until the value of NUMEXPERIMENTS has been
		//reached, incrementin counter by one
		for(count1 = 1; count1 <= NUMEXPERIMENTS; count1++)
		{
			//initialize variables to zero
			total = 0;
			count2 = 0;
			result = 0;
			
			//create loop that will repeat until sentinal value of -1 is reached
			while(result != -1)
			{
				//prompt for input, save input into s1 variable
				s1 = JOptionPane.showInputDialog("Enter a test result or -1 to end");
				result = Double.parseDouble(s1);//convert string to double
				//check to see if sentinal is reached - if so, exit loop
				if(result == -1) break;
				total = total + result;//accumulate total
				count2++;//increment counter
			}
			
			average = total / count2; //calculate average
			//display result
			JOptionPane.showMessageDialog(null, "The average for experiment " +
				count1 + " is: " + average, "Experiments", JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		
	}
	
}