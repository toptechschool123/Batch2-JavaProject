package day_17_ThrowsAnd_Throw_Keyword;

public class Throw_keyword {
    // Throws  
	// throw
	public static void main(String[] args) {

		 myData(30);
		 myMethod();
	}
	
	public static void myData(int age) {
		
		if(age<20) { 
			
			throw new ArithmeticException( "You are not allowed");
			
			
		} else System.out.println(" you are allowed in ");
	}
	
	public static void myMethod() {
		
		int a , b;
		a = 30;
		b= 30;
		
		
		if (a == b) { 
			throw new ArithmeticException(" wrong ");
		} else System.out.println("right");
	}

}
