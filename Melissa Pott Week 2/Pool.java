//File:  Pool.java
//Melissa Pott
//March 18, 2006
//CIS355
//Week 2 Homework component

import javax.swing.*; //include java library that includes gui components

public class Pool
{
	public static void main(String[] args)
	{
		//declare 3 string variables and four double variables
		//these will be used for the 3 user inputs and the 
		//result of the calculation
		String s1;
		String s2;
		String s3;
		double length, width, depth, volume;
		
		//assign the user input from javax input dialog to the s1 variable
		s1 = JOptionPane.showInputDialog("Enter the length of the swimming pool: ");
		//parse the string input into a double called length
		length = Double.parseDouble(s1);
		
		//assign the user input from javax input dialog to the s2 variable
		s2 = JOptionPane.showInputDialog("Enter the width of the swimming pool: ");
		//parse the string input into a double called width
		width = Double.parseDouble(s2);
		
		//assign the user input from javax input dialog to the s3 variable
		s3 = JOptionPane.showInputDialog("Enter the depth of the swimming pool: ");
		//parse the string input into a double called depth
		depth = Double.parseDouble(s3);
		
		//assign the value of the calculation to variable called volume	
		volume = length * width * depth;
		
		//use a dialog box to display the value assigned to the volume variable
		JOptionPane.showMessageDialog(null,"Volume = " + volume,
			"Pool", JOptionPane.PLAIN_MESSAGE);
			
		
	}
}