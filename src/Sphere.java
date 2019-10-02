/**
 *This class exists to create a sphere object
 * 
 * @author Elizabeth Fultz
 * @version 1.0
 * Programming Project 2: Writing GUI Program
 * Spring 2019
 */

public class Sphere {

	private double radius; //used to calculate the volume and surface area
	
	/**
	 * This empty constructor should initialize the instance variables
	 */
	public Sphere() {
		
		radius = 1;
		
	}//end empty constructor
	
	/**
	 * @param r the value of radius based on the calling method
	 */
	public Sphere(double r) {
		
		setRadius(r);
		
	}//end perfered constructor
	
	/**
	 * This method calculates the volume of the sphere
	 * 
	 * @return the volume
	 */
	public double getVolume() {
		
		return (4.0/3.0) * Math.PI * Math.pow(radius,3);
		
	}//end getVolume
	
	/**
	 * This method calculates the surface area of the sphere
	 * 
	 * @return the surface area
	 */
	public double getSurfaceArea() {
		
		return  4.0 * Math.PI * Math.pow(radius,2);
		
	}//end getSurfaceArea

	/**
	 * @return the radius
	 */
	public double getRadius() {
		
		return radius;
		
	}//end getRadius

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		
		this.radius = radius;
		
	}//end setRadius
	
	@Override
	public String toString() {
		
		return "Sphere [radius = " + radius + " volume = " + getVolume() + " surface area = " + getSurfaceArea() + "]";
		
	}//end toString	
	
}//end class

