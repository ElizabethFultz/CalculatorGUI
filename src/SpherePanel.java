import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class exists to create a panel that will calculate the volume and surface area 
 * of a sphere with the radius being an input from the user.
 * 
 * @author Elizabeth Fultz
 * @version 3.0
 * Programming Project 2: Writing GUI Program
 * Spring 2019
 */

public class SpherePanel extends JPanel{
	
	private JLabel inputLabel, volumeOutput, volumeResult, surfaceOutput, surfaceResult; //will be used to create the labels for the panel
	private JTextField radius; //will be used to create a JTextField so that radius can be inputed  
	private JButton clear, calculate; //will be used to create the buttons that will perform the actions in the panel
	
	/**
	 * This empty argument constructor should initialize the instance variables and create the specifications for the panel
	 */
	public SpherePanel() {
		
		setLayout(new GridLayout(0, 2));
		
		inputLabel = new JLabel("R=",SwingConstants.RIGHT);
		volumeOutput = new JLabel("Volume: ",SwingConstants.RIGHT);
		volumeResult = new JLabel ("--");
		surfaceOutput = new JLabel ("Surface Area: ",SwingConstants.RIGHT);
		surfaceResult = new JLabel ("--");
		clear = new JButton("Clear");
		calculate = new JButton("Calculate");
		
		radius = new JTextField(5);
		calculate.addActionListener(new ButtonListener());
		clear.addActionListener(new ButtonListener());
		
		setMinimumSize(new Dimension(3000,113));
		
		add(inputLabel);
		add(radius);
		add(volumeOutput);
		add(volumeResult);
		add(surfaceOutput);
		add(surfaceResult);
		add(clear);
		add(calculate);
		
	}//end SpherePanel
	
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
			
				String text = radius.getText();
			
				double sphereRadius = Double.parseDouble(text);
				Sphere sphere = new Sphere(sphereRadius);

				volumeResult.setText(Double.toString(sphere.getVolume()));
				surfaceResult.setText(Double.toString(sphere.getSurfaceArea()));	
			}else {
				radius.setText("");
				volumeResult.setText("--");
				surfaceResult.setText("--");
			}
				
			
		}//end actionPerformed
		
	}//end ButtonListener
		
}//end class
