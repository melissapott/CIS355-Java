//File:  Circle.java
//Melissa Pott
//April 13, 2006
//CIS355
//Week 6 Homework component

public class Circle extends Point
//this class has inheritance from the Point class
{
	private double radius; //variable declaration
	
	public Circle(double x1, double y1, double r)//constructor
	{
		//these variables refer to the constructor for the superior class Point
		super(x1, y1);
		
		//this variable exists in Circle, but not Point
		radius = r;
	}
	
	public double area()
	{
		//standard computation for the area of a circle, PI r^2
		return Math.PI * radius * radius;
	}
}