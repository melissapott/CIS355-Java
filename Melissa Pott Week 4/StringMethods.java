//File:  StringMethods.java
//Melissa Pott
//March 31, 2006
//CIS355
//Week 4 Homework component
//This program demonstrates string comparison and manipulation


import javax.swing.*; //library required for user input dialog boxes

public class StringMethods //declare class
{
	public static void main(String[] args)
	{
		//declare variables, display message box to accept user input into 2 string variables
		String string1 = JOptionPane.showInputDialog("Enter a string");
		String string2 = JOptionPane.showInputDialog("Enter another string");
		int n;
		
		//display the variables entered by the user in the console window
		System.out.println("string1 is the string " + string1);
		System.out.println("string2 is the string " + string2);
		System.out.println();//blank line
		
		//compare the strings for equality, store results in variable n
		n = string1.compareTo(string2);
		
		
		//if the comparison result is < 0 the first string is considered less than
		//the second string; if result is > 0, the first string is greater; if 
		//exactly 0, the strings are equal.  Test this result in an if statement 
		//and display the appropriate response message
		if (n < 0)
			System.out.println(string1 + " is less than " + string2);
		else if (n == 0)
			System.out.println(string1 + " is equal to " + string2);
		else
			System.out.println(string1 + " is greater than " + string2);
			
			
		//test the equality of the string to the value "HELLO" regardless of case
		//and display the appropriate message	
		if (string1.equalsIgnoreCase("HELLO"))
			System.out.println("string1 equals (ignoring case) HELLO");
		else
			System.out.println("string1 does not equal (ignoring case) HELLO");
		
		
		//determine and display the length, or number of characters and spaces in each string
		System.out.println("\nThe number of characters in string1 is " + string1.length());
		System.out.println("The number of characters in string2 is " + string2.length());
		
		
		//concatenate additional characters to the end of the first string and display the
		//resultant string and its new length
		string1 = string1.concat(" there world");
		System.out.println("\nAfter concatenation, string1 contiains the characters " + string1);
		System.out.println("The length of this string is " + string1.length());
		
		
		//convert the string to lower case letters and display the resultant string
		string1 = string1.toLowerCase();
		System.out.println("\nIn lowercase this string is " + string1);
		
		
		//convert the string to upper case letters and display the resultant string
		string1 = string1.toUpperCase();
		System.out.println("In uppercase this string is " + string1);
		
	}
}