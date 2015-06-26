//File:  MultiLineDialog.java
//Melissa Pott
//March 8, 2006
//CIS355
//Week 1 Homework component

//This program will demonstrate the use of a dialog box
//by displaying several lines of text

import javax.swing.*; //required library for dialog box


public class MultiLineDialog
{
	public static void main(String[] args)
	{
		//Call method to display dialog box and provide required parameters
		JOptionPane.showMessageDialog(null,
		"Computers, computers everywhere\n  as far as I can see\nI really, really like these things,\n  Oh joy, oh joy for me!",
		"Warning!",JOptionPane.WARNING_MESSAGE);
			
		System.exit(0);
	}
}