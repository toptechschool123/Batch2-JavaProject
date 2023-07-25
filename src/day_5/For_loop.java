package day_5;

public class For_loop {

	public static void main(String[] args) {
		/*
		 * int a = 0;
		 * 
		 * while (a<10) 
		 * { System.out.println(a);
		 *  a++; }
		 */
		
		
		// for loop:  0 1, 2, 3, 4, 5, 
		
		for(int a = 0; a<=5; a++) {
			
			System.out.println(a + " hi");
		}
		
		// for loop: 5, 4, 3, 2, 1, 0
		
		for(int b =5; b>=0; b--) {
			System.out.println("hello");
		}
		
		// 0, 2, 4, 6, 8, 10;
		// 0 , 3, 6, 9
		
		for(int c =0; c<10; c = c+2) {
			
			System.out.println(c);
		}
		
		
		
	}

}
