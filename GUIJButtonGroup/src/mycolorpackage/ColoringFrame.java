//************************************
//Program Name: LabelFrame.java
//Developer: Derrick Subnaik
//Date Created: 03/28/2024
//Version: 1.0
//Purpose: Assignment JButton Group
//************************************

package mycolorpackage;

import javax.swing.*;//allows us use java swing libraries
import java.awt.*;//allows us use java awt libraries
import java.awt.event.ActionEvent;//allows to use ActionEvent
import java.awt.event.ActionListener;//allows us to use ActionListener
import java.util.Random;//allows us use java random library

//Coloring Frame class extends JFframe and implements actionlistener
public class ColoringFrame  extends JFrame implements ActionListener{
	
	//initializing attributes for this class
	private Color colorSelected=null;
	private Random random=null;
	private JRadioButton redColorRadioButton=null;
	private JRadioButton greenColorRadioButton=null;
	private JRadioButton blueColorRadioButton=null;
	private JRadioButton randomColorRadioButton=null;
	private JTextArea nameTextArea=null;
	private final JPanel colorButtonPanel;
	
	//ColoringFrame constructor
	ColoringFrame()
	{
		//calling JFrame constructor
		super("Coloring Application");
		
		random=new Random();
		
		//creating a JRadioButton for red,green,blue and random
		redColorRadioButton= new JRadioButton("Red");
		greenColorRadioButton= new JRadioButton("Green");
		blueColorRadioButton= new JRadioButton("Blue");
		randomColorRadioButton= new JRadioButton("Random");
		
		//creating a ButtonGroup to add the color buttons
		ButtonGroup colorButtonGroup= new ButtonGroup();
		
		//adding the red,green,blue, and random button to ButtonGroup
		colorButtonGroup.add(redColorRadioButton);
		colorButtonGroup.add(greenColorRadioButton);
		colorButtonGroup.add(blueColorRadioButton);
		colorButtonGroup.add(randomColorRadioButton);
		
		//creating a panel for the color buttons
		colorButtonPanel= new JPanel(new FlowLayout());
		
		//adding red,green,blue and random button to colorButtonPanel
		colorButtonPanel.add(redColorRadioButton);
		colorButtonPanel.add(greenColorRadioButton);
		colorButtonPanel.add(blueColorRadioButton);
		colorButtonPanel.add(randomColorRadioButton);
		
		//creating a textArea and having Derrick subnaik as the text
		nameTextArea = new JTextArea("Derrick Subnaik");
		
		//creating a dimension for the size the textArea
		nameTextArea.setPreferredSize(new Dimension(200,100) );
		
		//creating a Jbutton for recolor
		JButton recolorButton = new JButton("Recolor");
		
		//adding a actionListener to recolorButton
		recolorButton.addActionListener(new ActionListener() 
		{
			//overriden method from the ActionListener library parent class
            @Override
            public void actionPerformed(ActionEvent e)
            {
            	//if the color selected is red
                if (redColorRadioButton.isSelected())
                {
                	//assigns red to the colorSelected
                    colorSelected = Color.red;
                } 
                
                //if the color  selected is green
                else if (greenColorRadioButton.isSelected()) 
                {
                	//assigns green to colorSelected
                    colorSelected = Color.green;
                } 
                
                //if the color selected is blue
                else if (blueColorRadioButton.isSelected())
                {
                	//assigns blue to colorSelected
                    colorSelected = Color.blue;
                } 
                
                //if the random color is selected 
                else if (randomColorRadioButton.isSelected()) 
                {
                	//calls the constructor of Color using three parameters from 0-255 to give us a random color
                	//then assigns that color to colorSelected
                    colorSelected = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                }
                
                //changes the color nameTextArea to the colorSelect
                nameTextArea.setForeground(colorSelected);
                
                //changes the background of JFrame to the colorSelected 
        		getContentPane().setBackground(colorSelected);
            }
        });//end of actionListener
		
		//setting the layout of this JFrame to be a FlowLayout
		setLayout(new FlowLayout());
		
		//adding the colorButtonPanel to this JFrame
		add(colorButtonPanel);
		
		//adding nameTextArea to this JFrame
		add(nameTextArea);
		
		//adding the recolorButton this JFrame
		add(recolorButton);
		
	}//end of Coloring Frame constructor
	
}//end of ColoringFrame
