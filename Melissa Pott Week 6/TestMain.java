//File:  TestMain.java
//Melissa Pott
//April 13, 2006
//CIS355
//Week 6 Homework component

//this program is an exercise in class inheritance and is used to 
//demonstrate the relationship between the Point class and the Circle class

public class TestMain
{
	public static void main(String args[])
	{
		//create a Point object with the XY coordinates of 10,20
		Point p = new Point(10,20);
		//create a Circle object, which is a derivitive of Point
		//therefore it has XY coordinates, plus a radius.  The XY
		//coordinates are 20,30 and the radius is 25
		Circle c = new Circle(20, 30, 25);
		
		//by nature, a point has no area, but we can display that fact here
		//by calling the area method in the Point object
		System.out.print("Point Area: ");
		System.out.println(p.area());
		
		//Because p and c are both points, they both have x and y coordinates
		//we can call the distance method in the Point object to compute the
		//distance between the two points
		System.out.print("Point distance: ");
		System.out.println(p.distance(c));
		
		//While points don't have areas, circles do.  We can display the 
		//area of the Circle object c by calling the area method of the 
		//Circle class object
		System.out.print("Circle area: ");
		System.out.println(c.area());
		
		//because a Circle object is also a point, it has access to the
		//distance method as well.  We can display the distance between c
		//and p by calling the distance method from the Circle object
		System.out.print("Circle distance: ");
		System.out.println(c.distance(p));
		
	}
}