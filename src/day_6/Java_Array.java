package day_6;

public class Java_Array {

	public static void main(String[] args) {

		// Java Array:  10, 20, 30, 40, 22, 33, 
		//  book, pen, pencil , eraser, e...
		
		int age = 40 ;
		int  a = 50;
		int b = 30; 
		
		String name = " apple";
		String address = " Seattle ";
		String country  = "USA";
		
					// elements of the array
					// index number 0,1,2....
		
		int [] g = { 10, 20, 30, 40}; 
				//   0   1    2  3
		
		String [] h = { "book", "pen", "pencil", "eraser", "sharpener" };
		
		double [] c = { 2.2, 3.2, 3.3 };
		
		// elements of an array starts with index of zero
		
	//	System.out.println(g[6]); //
		
		System.out.println(h[2]);
		
	//	System.out.println(h[4]);
		int x;
		x = 55;
		int [] y; // array declaration
		
		y = new int [4]; // memory allocation
		
		y[0] = 2;
		y[1] = 6;
		y[2] = 8;
		y[3] = 10;
		
		int [] gg = { 10, 20, 30, 40}; 
		
		String [] u;
		u = new String[5]; // memory allocation 
		// apple, banana, pear, cherry, orange
		
			u[0]= "apple";
			u[1]= " banana";
			u[2]= " pear";
			u[3] = " cherry";
			u[4]= "orange";
			
			System.out.println(u[4]);
			System.out.println(u[1]);
			
			String [] v = { "apple", "banana", "pear", "cherry", "orange" };
			
			System.out.println(v[2]);
			
			int [] t = new int[3]; // 303, 202, 101;
			t[0]=303;
			t[1]=202;
			t[2]=101;
			
			// How to assign a different value
			 t[2]=1000;
			 System.out.println(t[2]);
			
			 
	}

}
