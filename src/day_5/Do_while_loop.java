package day_5;

public class Do_while_loop {

	public static void main(String[] args) {
		/*
		 * The Do/While Loop
		 * 
		 * The do/while loop is a variant of the while loop. This loop will execute the
		 * code block once, before checking if the condition is true, then it will
		 * repeat the loop as long as the condition is true. The loop will always be
		 * executed at least once, even if the condition is false, because the code
		 * block is executed before the condition is tested:
		 * 
		 */
		
		
	
		 int i = 0;
		 
		 do { 
			 System.out.println("hi");
			 i++;
		 }   while(i>5); // false
		 
 
 
		 int a = 1;
		 do {
			 System.out.println(a);
			 a++;
		 } while(a<=5); // true
		 
	
		 int x =10;
		 do {
			 System.out.println(x);
			 x --;
		 } while (x>0);
	}

}
