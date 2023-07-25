package day_5;

public class Increment_Decrement {

	public static void main(String[] args) {

		 // increment = increase ++   // pre-increment - post-increment
		// decrement = decrease  --  // pre-decrement  -- post-decrement
		
		int counter = 0;
		
		System.out.println(counter); // 0
		System.out.println(++counter); // 1
		
		System.out.println(counter); // 1
		
		System.out.println(--counter); // 0
		
		System.out.println(counter); // 0
		
		System.out.println(counter++); // 0
		
		System.out.println(counter );  // 1
	
		int b = 1; 
		
		System.out.println(++b);
		
		System.out.println(--b);
		System.out.println(--b);
		System.out.println(--b);

		int c = 1;
		
		System.out.println(c++); // 1
		
		System.out.println(c); // 2
		
		int d = 1; 
		
		System.out.println(d--); // 1
		System.out.println(d); // 0
	}

}
