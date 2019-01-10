/**
 * 
 * @author clafollette
 *
 */
public class Circle {

	private double radius; //variable for the radius
	
	
	
/*
 * empty-argument constructor
 */
	
	public Circle() {
		
		radius = 1.0;
		
	}//end empty-argument constructor
	
	
	
	
/*
 * full-argument constructor
 */
	
	public Circle(double radius) {
		
		setRadius(radius);
		//or use this:
		//this.setRadius(radius);
		
	}//end preferred constructor
	
	
	
	
/*
 * method	
 */
	
	public double calculateArea() {
		
		double result = Math.PI * Math.pow(radius,  2);
		
		return result;
		
		//return Math.PI * Math.pow(radius,  2);
		//is equivalent to two lines of code above
		
	}//end calculateArea


	
/*
 * Getters and Setters
 */
	
	
/**
 * This method returns the value of
 * the radius.
 * @return - radius OR returns the
 * value of radius.
 */
	
	public double getRadius() {
		return radius;
	}//end getRadius

	
/**
 * This methods sets the value of
 * the radius. The method bounds
 * checks the radius > 1.0.
 * @param radius
 */
	
	
	public void setRadius(double radius) {
		
		if(radius >= 1.0) {
			this.radius = radius; //this refers to object
		//this.radius and radius are different
		//radius is the variable and this.radius is just calling the method from up above
		}//end if
		else {
			this.radius = 1.0;
		}//end else
		
	}//end setRadius


/*
 * toString
 */

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}//end toString
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end class
