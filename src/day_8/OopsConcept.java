package day_8;

public class OopsConcept {

	public static void main(String[] args) {
		
		// what is  method in java
		// how to create a method
		// Object is a member or instance of a class
		// How to create an object of a class
		
	 
		OopsConcept ob = new OopsConcept();
		
		ob.method1();
		ob.method2();
		ob.data();
		
	}
	
	void method1() {
		
		int age = 40;
		System.out.println(age);
		System.out.println(" it is method 1");
		/// 100, 200 
	}
	
	void method2() {
		
		String name = " SDET";
		System.out.println(name);
		System.out.println(" it is method 2");
	}
	
	void data() {
		System.out.println(" it is data method");
	}
	
	

}
