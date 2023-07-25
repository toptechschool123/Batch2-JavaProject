package day_9;

public class Practice2 {
	
	int g = 3000;    // global variable 
	static String name = "city";
	public static void main(String[] args) {
		
		// curly brace
		// call the method
		// how to create an object
		
		
		Practice2 x = new Practice2();
		System.out.println(x.g);
		System.out.println(name);
		
		x.data();
		myMethod();
		Practice2.myMethod();
	}
	
	void data() {
		
		int age = 60;
		String name = "book";
		System.out.println(name);
		System.out.println(age);
	}
	
	static void myMethod() {
		
		System.out.println("hello");
		
	}
	
	

}
