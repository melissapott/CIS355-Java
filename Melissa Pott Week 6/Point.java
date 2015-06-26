//File:  Point.java
//Melissa Pott
//April 13, 2006
//CIS355
//Week 6 Homework component

public class Point
{
	private double x;
	private double y;
	
	public Point(double x1, double y1)//constructor
	{
		x = x1;
		y = y1;
	}
	
	public double distance(Point other)
	{
		//this method will compute the distance between this point
		//and another point that is passed in as a parameter
		
		double xDiff = x - other.x;
		double yDiff = y - other.y;
		
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}
	
	public double area()
	{
		//return 0 because by nature, a point has no area
		
		return 0;
	}
}