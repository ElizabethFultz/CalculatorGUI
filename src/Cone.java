/**
 *This class exists to create a cone object
 * 
 * @author Elizabeth Fultz
 * @version 1.0
 * Programming Project 2: Writing GUI Program
 * Spring 2019
 */

public class Cone {
	
	private double radius; //used to calculate the volume and surface area
	private double height; //used to calculate the volume and surface area
	
	/**
	 * This empty constructor should initialize the instance variables
	 */
	public Cone() {
		
		radius = 1;
		height = 1;
	}//end empty constructor
	
	/**
	 * 
	 * @param r the value of radius based on the calling method
	 * @param h the value of height based on the calling methos
	 */
	public Cone(double r, double h) {
		
		setRadius(r);
		setHeight(h);
		
	}//end preferred constructor
	
	/**
	 * 
	 * @return the volume of the cone
	 */
	public double getVolume() {
		
		return Math.PI * Math.pow(radius,2) * (height/3.0);
		
	}//end getVolume
	
	/**
	 * 
	 * @return the surface area of the cone
	 */
	public double getSurfaceArea() {
		
		return (Math.PI * radius) * (radius + Math.sqrt(Math.pow(height,2) + Math.pow(radius,2)));
		
	}//end getSurfaceArea

	/**
	 * @return the radius
	 */
	public double getRadius() {
		
		return radius;
		
	}//end getRadius

	/**
	 * @return the height
	 */
	public double getHeight() {
		
		return height;
		
	}//end getHeight

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		
		this.radius = radius;
		
	}//end setRadius

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		
		this.height = height;
		
	}//end setHeight
	
	@Override
	public String toString() {
		
		return "Cone [radius = " + radius + " height = " + height + " volume = " + getVolume() + " surface area = " + getSurfaceArea() + "]";
	
	}//end toString

}//end class
