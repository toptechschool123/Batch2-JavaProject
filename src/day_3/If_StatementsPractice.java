package day_3;

public class If_StatementsPractice {

	public static void main(String[] args) {


		if(20>30) {
			System.out.println(" 20 is less than 30");
			
		}  else System.out.println(" 30 is more than 20"); 
		
		
		int a = 10;
		int b = 15;
		int c = 30;
		
		if( a < b) {
			System.out.println(" a is less than b");
			
		}	else System.out.println(" a is not equal to b");
		
		
		
		if( a > b ) { 
			System.out.println( " a is not more than b");
			
		}  else if( b >c) {
			System.out.println("b is not more than c");
			
			
		}	else System.out.println(" c is the greatest number");
		
		// logical operators &&, || !
		
		int x = 40;
		int y = 50;
		int z = 60;
		
		if(x == y || y>x ) {
			
			System.out.println("y is greater than x");
		}	else System.out.println(" x is greater than y");
		
		if ( x < y && z<y) {
			System.out.println(" z is the greatest number");
			
		} else if ( y <x || x< y) { 
			System.out.println(" x is the greatest number ");
			
		} else System.out.println("y is the greates number ");

	}

}
