//************************************
//Program Name: LabelFrame.java
//Developer: Derrick Subnaik
//Date Created: 03/19/2024
//Version: 1.0
//Purpose: Assignment Arrays and Simple GUI
//************************************
package myjavapackage;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

//LabelFrame class extends JFrame class
public class LabelFrame extends JFrame
{
	final int ARRAY_SIZE=5;//constant for the size of the array
	
	//class attributes
	private int arraySum=0;
	private int arrayAverage=0;
	private int biggestNumber=0;
	private int smallestNumber=0;
	private JLabel biggestNumberLabel=null;
	private JLabel smallestNumberLabel=null;
	private JLabel arrayAverageLabel=null;
	
	LabelFrame()
	{
		//calling the constructor of JFrame
		super("My Frame");
		
		//creating an array with 5 elements
		int userInputArray[]= new int[ARRAY_SIZE];
		
		//for loop to receive user input
		for(int i=0;i<userInputArray.length;i++)
		{
			//Displays an input dialog box to the user
			String element = JOptionPane.showInputDialog("Value for " + (i+1) +". array element");
			
			//stores the user input into array
			userInputArray[i] = Integer.parseInt(element); 
		}
		
		//for loop to find the sum of uderInputArray
		for(int i=0;i<userInputArray.length;i++)
		{
			arraySum += userInputArray[i];
		}
		
		//finds the average of the array
		arrayAverage=arraySum/userInputArray.length;
		
		//sorts the array in ascending order
		Arrays.sort(userInputArray);
		
		//assigning the smallest index as the smallest number since array is sorted
		smallestNumber=userInputArray[0];
		
		//assigning the last array index because the array is sorted in ascending order
		biggestNumber=userInputArray[userInputArray.length-1];
		
		//creating JLabel for biggestNumberLabel
		biggestNumberLabel = new JLabel("The biggest number in the array is "+ biggestNumber +".");
		
		//setting the color of biggestNumberLabel to blue
		biggestNumberLabel.setForeground(Color.blue);
		
		//creating JLabel for smallestNumberLabel
		smallestNumberLabel = new JLabel("The smalled number in the array is "+ smallestNumber +	".");
		
		//setting the color of smallestNumberLabel to red
		smallestNumberLabel.setForeground(Color.red);
		
		//creating JLabel for arrayAverage
		arrayAverageLabel= new JLabel("The average of the array is "+ arrayAverage + ".");
		
		//setting the color of arrayAverageLabel to blue
		arrayAverageLabel.setForeground(Color.blue);
		
		//creating a JPanel to add the labels
		JPanel panel = new JPanel(new GridLayout(3,1));

		//adding the biggestNumberLabel to the panel
		panel.add(biggestNumberLabel);
		
		//adding the smallestNumberLabel to the panel
		panel.add(smallestNumberLabel);
		
		//adding the arrayAverageLabel to the panel
		panel.add(arrayAverageLabel);

		//adding the panel to JFrame
		add(panel);
		
		
	}//end of LabelFrame Constructor

}//end of LabelFrame class
