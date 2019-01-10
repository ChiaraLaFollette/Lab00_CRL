/**
 * 
 * @author clafollette
 *
 */


public class Application {

	public static void main(String[] args) {
		System.out.println("Hello there.");
		
		
		Circle c = new Circle();
		System.out.println(c.toString());
		System.out.println("Area = " + c.calculateArea());
		
		Circle c2 = new Circle(2.3);
		System.out.println(c2.toString());
		System.out.println("Area = " + c.calculateArea());
		
		Circle c3 = new Circle(-1.9);
		System.out.println(c3.toString());
		System.out.println("Area = " + c.calculateArea());
	
		
		

	}//end main

}//end class
