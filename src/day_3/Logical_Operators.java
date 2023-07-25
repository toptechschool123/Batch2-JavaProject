package day_3;

public class Logical_Operators {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;
		int c = 10;

		// Logical operators;

		// && = and both conditions should be true
		// || = or one of the two conditions should be true
		// ! = not

		// Code Alignment: ctrl + shift + f 
		
		
		  System.out.println(a > b && a > c); // true
		  
		  System.out.println(a < b && a > c);
		  
		  System.out.println(a < b && c < b);
		  
		 
		
		System.out.println(a > b || a < c);
		System.out.println(a > b || c < a);

		System.out.println(!(c > b && b > a));

		System.out.println(!(c > b || b > a));

		System.out.println(!(a > b && a > c));
	}

}
