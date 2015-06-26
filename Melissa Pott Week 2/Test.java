//File:  Test.java
//Melissa Pott
//March 18, 2006
//CIS355
//Week 2 Homework component

/*Test will be used in conjunction with class "Cylinder" to demonstrate 
 *passing values between two different classes in two different files
 */
 
 

public class Test
{
	public static void main(String[] args)
	//the main() method is required to execute a program
	{
		Cylinder cylinder = new Cylinder(3,5); //create new cylinder object	
		
		//the next 3 lines call the accessor methods of the cylinder class
		System.out.println("Radius = " + cylinder.getRadius());
		System.out.println("Height = " + cylinder.getHeight());
		System.out.println("Volume = " + cylinder.volume());
		
		cylinder.setRadius(4); //change a value using a mutator
		cylinder.setHeight(5); //change a value using a mutator
		
		//the following lines call the accessor methods of cylinder class
		System.out.println("New Radius = " + cylinder.getRadius());
		System.out.println("New Height = " + cylinder.getHeight());
		System.out.println("New Volume = " + cylinder.volume());
		
		}
	}