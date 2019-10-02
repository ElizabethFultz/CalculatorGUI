import java.awt.*;
import javax.swing.*;

/**
 * The Application Class exists to create a JFram that contains a Sphere Panel, a Cylinder Panel, and a Cone Panel. 
 * 
 * @author Elizabeth Fultz
 * @version 2.0
 * Programming Project 2: Writing GUI Program
 * Spring 2019
 */

public class Application {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Geometry Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
		
		SpherePanel spherePanel = new SpherePanel();
		spherePanel.setBorder(BorderFactory.createTitledBorder("Sphere"));
		spherePanel.getMinimumSize();
		frame.getContentPane().add(spherePanel);
		
		CylinderPanel cylinderPanel = new CylinderPanel();
		cylinderPanel.getMinimumSize();
		cylinderPanel.setBorder(BorderFactory.createTitledBorder("Cylinder"));
		frame.getContentPane().add(cylinderPanel);
		
		ConePanel conePanel = new ConePanel();
		conePanel.setBorder(BorderFactory.createTitledBorder("Cone"));
		conePanel.getMinimumSize();
		frame.getContentPane().add(conePanel);
		
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}//end main

}//end class
