//File:  DayGui.java
//Melissa Pott
//April 9, 2006
//CIS355
//Week 5 Homework component
//This program demonstrates the use of two buttons, which will 
//respond with a message box when clicked.

//import libraries required for gui controls and event handling
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;

public class DayGui extends JFrame
{
	private JFrame mainFrame;//declare a content frame
	private JButton cmdGood; //declare a button
	private JButton cmdBad; //declare a button
	
	public DayGui()
	{
		mainFrame = new JFrame("Messages"); //create content frame object
		cmdGood = new JButton("Good"); //create button object
		cmdBad = new JButton("Bad"); //create button object
		
		Container c = mainFrame.getContentPane();//container to hold the buttons
		c.setLayout(new FlowLayout());//determines how controls will be layed out in container
		
		//add the buttons to the container
		c.add(cmdGood);
		c.add(cmdBad);
		
		//define the shortcut keys for the buttons
		cmdGood.setMnemonic('G');
		cmdBad.setMnemonic('B');
		
		mainFrame.setSize(30,100);//set size of frame
		
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});//close the application if the window is closed
		
		//instatiate and register listener class to listen for and 
		//respond to the button click actions
		ButtonsHandler bhandler = new ButtonsHandler();
		cmdGood.addActionListener(bhandler);
		cmdBad.addActionListener(bhandler);
		
		mainFrame.show();
		
	}
	
	class ButtonsHandler implements ActionListener //define listener class
	{
		public void actionPerformed(ActionEvent e)
		{
			//determine which button generated and action and respond accordingly
			if (e.getSource() == cmdGood)
				JOptionPane.showMessageDialog(null, "Today is a good day!",
					"Event Handler Message", JOptionPane.INFORMATION_MESSAGE);
			else if (e.getSource() == cmdBad)
				JOptionPane.showMessageDialog(null, "I'm having a bad day today!",
					"Event Handler Message", JOptionPane.INFORMATION_MESSAGE);
			System.out.println(e.getSource())		;
		}//end actionPerformed
	}//end ButtonsHandler class


public static void main(String args[])
{
	DayGui app;
	app = new DayGui();
}
}