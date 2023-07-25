package day_5;

public class While_loop {

	public static void main(String[] args) {
		/*
		 * Loops can execute a block of code as long as a specified condition is
		 * reached. Loops are handy because they save time, reduce errors, 
		 * and they make code more readable
		 * 
		 * Java While Loop
		The while loop loops through a block of code as long as a specified condition is true:
		please refer to the slides for more details
		 */
		
	//	System.out.println("hi"); // 100
		
		int i = 0;
		
		while( i<=10) {
			System.out.println(  i);
			//i++;
			i = i+1;
			//i = i+2;
		}
		
		int a = 1; 
		while(a<=10) {
			System.out.println( "Hi");
			a++;
		}
		
		int x = 10;
		
		while(x>0) {
			System.out.println(x);
			x--;
		}
		
		int y = 15;
		while(y>0) {
			System.out.println(y);
			y = y-3;
		}

	}

}
