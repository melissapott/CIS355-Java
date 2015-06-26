//File:  OfficeAreaCalculator.java
//Melissa Pott
//April 9, 2006
//CIS355
//Week 5 Homework component


//import libraries required for gui controls, event handling and formatting
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;
import java.text.*;

public class OfficeAreaCalculator extends JFrame
{

//declare the controls
private JFrame mainFrame;
private JButton calculateButton;
private JButton exitButton;
private JTextField lengthField;
private JTextField widthField;
private JTextField areaField;
private JLabel lengthLabel;
private JLabel widthLabel;
private JLabel areaLabel;

public OfficeAreaCalculator()
{
	mainFrame = new JFrame("Office Area Calculator");//create the container
	
	//create the buttons, fields, and labels
	calculateButton = new JButton("Calculate area");
	exitButton = new JButton("Exit");
	lengthLabel = new JLabel("Enter the length of the office: ");
	widthLabel = new JLabel("Endter the width of the office: ");
	areaLabel = new JLabel("Office area: ");
	lengthField = new JTextField(5);
	widthField = new JTextField(5);
	areaField = new JTextField(5);
	
	Container c = mainFrame.getContentPane();//container will hold the controls
	c.setLayout(new FlowLayout());//defines how controls will be placed in container
	
	//put the controls in the container
	c.add(lengthLabel);
	c.add(lengthField);
	c.add(widthLabel);
	c.add(widthField);
	c.add(areaLabel);
	c.add(areaField);
	c.add(calculateButton);
	c.add(exitButton);
	
	//define shortcut keys
	calculateButton.setMnemonic('C');
	exitButton.setMnemonic('x');
	
	mainFrame.setSize(250,200);
	
	mainFrame.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e) {System.exit(0);}
	});//stop the application if the widow is closed
	
	//instantiate and register handlers for the buttons
	calculateButtonHandler chandler = new calculateButtonHandler();
	calculateButton.addActionListener(chandler);
	
	
	exitButtonHandler ehandler = new exitButtonHandler();
	exitButton.addActionListener(ehandler);
	
	//instantiate and register handlers to respond to focus events
	FocusHandler fhandler = new FocusHandler();
	lengthField.addFocusListener(fhandler);
	widthField.addFocusListener(fhandler);
	areaField.addFocusListener(fhandler);
	
	mainFrame.show();
	
	}
	
	class calculateButtonHandler implements ActionListener //code for reacting to button click
	{
		public void actionPerformed(ActionEvent e)
		{
			
			DecimalFormat num = new DecimalFormat(",###.##");//formatting for number display
			double width, length, area;//declare variables
			String instring; //declare input string
			
			instring = lengthField.getText();//put the length entry into the instring variable
			
			//if the user tried to enter a blank space, call it a 0
			if (instring.equals(" "))
			{
				instring = "0";
				lengthField.setText("0");
			}
			
			length = Double.parseDouble(instring);//parse the input into a double
			
			//if the user tried to enter blank space, make it a 0
			instring = widthField.getText();//get the text entered for the width field
			if (instring.equals(" "))
			{
				instring = "0";
				lengthField.setText("0");
			}
			
			width = Double.parseDouble(instring);//parse the input into a double
			area = length * width;//calculate area
			areaField.setText(num.format(area));//display result of calculcation
		}//end actionPerformed()
		
	}//end calculateButtonHandler
	
	class exitButtonHandler implements ActionListener //close the app when exit button is pressed
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}//end ExitButtonHandler
	
	class FocusHandler implements FocusListener //define what we do when focus changes
	{
		public void focusGained(FocusEvent e)
		{
			if(e.getSource() == lengthField || e.getSource() == widthField)
			{
				areaField.setText("");//clear the input fields when they receive focus
			}
			else if(e.getSource() == areaField)
			{
				areaField.setNextFocusableComponent(calculateButton);
				calculateButton.grabFocus();//once we leave the input fields, put the focus on the calc button
			}
		}//end focusGained()
		
		public void focusLost(FocusEvent e)
		{
			if(e.getSource() == widthField)
			{
				widthField.setNextFocusableComponent(calculateButton);
			}
		}//end focusLost
	}//end FocusHandler
	

	public static void main(String args[])
	{
		new OfficeAreaCalculator();
	}

}