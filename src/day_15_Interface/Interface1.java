package day_15_Interface;

public interface Interface1 {

	// all methods in interface are abstract
	// And it should be implemented by a regular class
	// the keyword implement is used 
	
	public abstract void myData();
	public abstract void myMethod();
	
	default void empData() {
		System.out.println("hello world"); // java version 8 
		
		// user defined interface 
		// built-in interface -- implementing classess
	}
	
	public static void empRole() {
		System.out.println("it is interface method with static keyword");
	}
}
