//File:  CompareNumbers.java
//Melissa Pott
//April 2, 2006
//CIS355
//Week 4 Homework component
//this program demonstrates the use of single dimension parallel arrays


import java.text.*;//required for decimal formatting

public class ThreeArrays //declare class
{
	public static void main(String[] args)
	{
		final int NUMELS = 10;//declare constant
		
		//declare and initialize 3 arrays
		double[] price = {10.62,14.89,13.21,16.55,18.62,9.47,6.58,18.32,12.15,3.98};
		double[] quantity = {4,8.5,6,7.35,9,15.3,3,5.4,2.9,4.8};
		double[] amount = new double[NUMELS];
		
		DecimalFormat df = new DecimalFormat("000.00"); //define formatting requirements
		
		extend(price, quantity, amount);//call the extend method
		
		//iterate through each value in the amount array by subscript and display
		//using the defined format
		for (int i = 0; i < NUMELS; i++)
			System.out.println(df.format(amount[i]));
			
	}
	
	public static void extend(double[] p, double[] q, double[] a)
	//this method will accept 3 arrays and use a for loop to iterate through
	//each value, multiplying the corresponding values of the first and second
	//arrays, and storing the resulting value in the corresponding location of  
	//the third array
	{
		for (int i = 0; i < p.length; i++)
			a[i] = p[i] * q[i];
	}
}