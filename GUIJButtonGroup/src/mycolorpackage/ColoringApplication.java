//************************************
//Program Name: LabelFrame.java
//Developer: Derrick Subnaik
//Date Created: 03/28/2024
//Version: 1.0
//Purpose: Assignment JButton Group
//************************************
package mycolorpackage;

import javax.swing.JFrame;

//ColoringApplication is the driver class of ColoringFrame
public class ColoringApplication {

	//main method
	public static void main(String[] args) {
		
		//creating a coloringFrame object
		ColoringFrame coloringFrame = new ColoringFrame();
		
		//exits the application when the close button is pressed
		coloringFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setting the size of the frame
		coloringFrame.setSize(400,300);
		
		//allowing the frame to be visible
		coloringFrame.setVisible(true);
		
	}//end of main
	
}//end of ColoringApplication
