//File:  Cylinder.java
//Melissa Pott
//March 18, 2006
//CIS355
//Week 2 Homework component

public class Cylinder  //give the class a name
{
	//declare 2 instance variables for the class
	private double radius;
	private double height;
	
	public Cylinder(double r, double h)
	//the constructor is called when the class is referenced by the 
	//caller.  This constructor will accept two double values into the 
	//class and reference them by names "r" and "h"
	 	
	 {
	 	radius = r; 
	 	//the first value accepted into this class is assigned to the 
	 	//variable "radius"
	 	height = h;
	 	//the second value accepted into this class is assigned to the 
	 	//variable "height"
	 	
	 }
	 	
	 public void setRadius(double r) //mutator method
	 {
	 	radius = r; //assign a new value to radius
	 }
	 		
	 public void setHeight(double h)//mutator mehtod
	 {
	 	height = h; //assign a new value to height
	 }
	 
	 public double getRadius() //accessor method
	 {
	 	return radius; //return the value in radius
	 }
	 
	 public double getHeight()  //accessor method
	 {
	 	return height; //return the value in height
	 }
	 
	 public double volume() //class method
	 {
	 	return radius * radius * height * Math.PI; //calc and return volume
	 }
	 
}
