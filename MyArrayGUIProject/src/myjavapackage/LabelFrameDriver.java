//************************************
//Program Name: LabelFrameDriver.java
//Developer: Derrick Subnaik
//Date Created: 03/19/2024
//Version: 1.0
//Purpose: Assignment Arrays and Simple GUI
//************************************
package myjavapackage;
import javax.swing.JFrame;

//labelFrameDriver class   
public class LabelFrameDriver {

	//main
	public static void main(String[] args) {
		 
		//creating a labelFrame object
		LabelFrame labelFrameObject = new LabelFrame();
		 
		//exits the application when the close button is pressed
		labelFrameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		//setting the size of the frame
		labelFrameObject.setSize(400,200);
		 
		//allowing the frame  to be visible
		labelFrameObject.setVisible(true);
		 
	}//end of main
}//end of LabelFrameDriver
