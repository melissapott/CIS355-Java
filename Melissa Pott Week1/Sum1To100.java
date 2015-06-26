//File:  Sum1To100.java
//Melissa Pott
//March 8, 2006
//CIS355
//Week 1 Homework component

//This program will calculate the sum of the numbers from 1 to 100
//using the forumla sum=(n/2)*(2*a+(n-1)*d)

public class Sum1To100
{
	public static void main(String[] args)
	{
		//declare and initialize variables
		
		int n = 100; //the number of terms to be added
		int a = 1; //the first term
		int d = 1; //the difference between each number
		int sum;
		
		sum = (n/2)*(2*a+(n-1)*d); //execute calculation
		
		System.out.println("the sum of all numbers from 1 to 100 = " + sum); //display result
		
	}
}