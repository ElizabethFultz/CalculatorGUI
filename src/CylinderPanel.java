import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *This class exists to create a panel that will calculate the volume and surface area 
 * of a cylinder with the radius and height being inputs from the user
 * 
 * @author Elizabeth Fultz
 * @version 3.0
 * Programming Project 2: Writing GUI Program
 * Spring 2019
 */

public class CylinderPanel extends JPanel{
	
	private JLabel radiusLabel, heightLabel, volumeOutput, volumeResult, surfaceOutput, surfaceResult; //will be used to create the labels for the panel
	private JTextField radius, height; //will be used to create a JTextField so that height can be inputed  
	private JButton clear, calculate; //will be used to create the buttons that will perform the actions in the panel
	
	/**
	 * This empty argument constructor should initialize the instance variables and create the specifications for the panel
	 */	
	public CylinderPanel() {
		
		setLayout(new GridLayout(0, 2));
		
		radiusLabel = new JLabel("R=",SwingConstants.RIGHT);
		heightLabel = new JLabel("H=",SwingConstants.RIGHT);
		volumeOutput = new JLabel("Volume: ",SwingConstants.RIGHT);
		volumeResult = new JLabel ("--");
		surfaceOutput = new JLabel ("Surface Area: ",SwingConstants.RIGHT);
		surfaceResult = new JLabel ("--");
		clear = new JButton("Clear");
		calculate = new JButton("Calculate");
		
		radius = new JTextField();
		height = new JTextField();
		calculate.addActionListener(new ButtonListener());
		clear.addActionListener(new ButtonListener());
		
		 setMinimumSize(new Dimension(3000,113));
		
		add(radiusLabel);
		add(radius);
		add(heightLabel);
		add(height);
		add(volumeOutput);
		add(volumeResult);
		add(surfaceOutput);
		add(surfaceResult);
		add(clear);
		add(calculate);
		
	}//end CylinderPanel
	
	/**
	 *This class exists to create a listener that will perform an action when the clear or calculate buttons are pressed
	 * 
	 * @author Elizabeth Fultz
	 * @version 2.0
	 * Programming Project 2: Writing GUI Program
	 * Spring 2019
	 */
	
	private class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource() == calculate) {
				String r = radius.getText();
				String h = height.getText();
				
				double cylinderRadius = Double.parseDouble(r);
				double cylinderHeight = Double.parseDouble(h);
				Cylinder cylinder = new Cylinder(cylinderRadius,cylinderHeight);

				volumeResult.setText(Double.toString(cylinder.getVolume()));
				surfaceResult.setText(Double.toString(cylinder.getSurfaceArea()));
			}else {
				radius.setText("");
				height.setText("");
				volumeResult.setText("--");
				surfaceResult.setText("---");
			}
			
		}//end actionPerformed
		
	}//end ButtonListener
			
}//end class
