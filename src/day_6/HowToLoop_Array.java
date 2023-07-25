package day_6;

public class HowToLoop_Array {

	public static void main(String[] args) {
		
		
  System.out.println("*************one**********");
  
		String [] ar = { "pen", "book", "pencil", "eraser" };
		
	//	System.out.println(ar[3]);
		
		// how to print out all elements of an array:  we use for loop: 
		
		for( int i = 0; i<=3; i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("*************two**********");
		
		
		int [] x = { 1 ,2,3, 4, 5, 6, 7, 8 };
		
		// length of array
		
		for(int i=0; i<x.length;i++	) {
			System.out.println(x[i]);
		}
		System.out.println("*************three**********");
		
		// For each loop or enhanced for loop: 
		
		
		int [] p = {2,3, 4, 5, 6};
		
		// using for each loop
		
		for(int var: p) {
			System.out.println(var);
		}
		System.out.println("*************four**********");
		
		String [] fruits = {"apple", "banana", "orange", "pear"};
		
		for(String i:  fruits) {
			System.out.println(i);
		}
		
		// 20, 30, 40, 50 : using for each loop: 

	}

}
