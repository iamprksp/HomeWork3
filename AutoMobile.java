/*
1. What is encapsulation?  
Encapsulation is a fundamental concept in object-oriented programming (OOP) that involves bundling data and methods that operate on that data into a single unit, typically a class. This concept is crucial for protecting data from unauthorized access and modification, enhancing code organization, and streamlining interactions between different parts of a program.  

2. What is a null reference and what is the problem with it?  
A null reference occurs when a reference variable is not pointing to any object or value in memory. This can lead to runtime errors, commonly known as null reference exceptions, when the program tries to access or manipulate the non-existent object. These errors can cause the program to crash or behave unexpectedly, making it crucial to handle null references properly in your code.  

3. What is the difference between inheritance and composition?  
Inheritance and composition are key OOP concepts. Inheritance (an "is-a" relationship) lets a subclass inherit from a superclass, promoting code reuse (e.g., Dog inherits from Animal). Composition (a "has-a" relationship) builds classes using other objects, enhancing flexibility (e.g., Car has an Engine). Use inheritance for hierarchy and shared behavior, composition for modular, maintainable design.
*/


//create a Automobile class
public class AutoMobile {

	//ATTRIBUTES MODELYEAR AND BRAND
	private int modelYear;
	private String brand;
	
	public AutoMobile(int modelYear, String brand ) {
		this.modelYear = modelYear;
		this.brand=brand;
		
		
		
	}
	
	public int getmodelYear() {
		return modelYear;
		
	}
	
	public String brand() {
		return brand;
		
		
	}
	
	
	//METHOD HONK
	public void honk() {
		System.out.println( brand + "honks: Honk!");
		
		
		
	}
	
	public void accelerate () {
		System.out.println(" " );
		
	}
	public void stop() {
		System.out.println(" " );
		
	}
	public void reverse() {
		System.out.println(" " );
		
	}
	
	
}


