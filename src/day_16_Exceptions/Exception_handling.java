package day_16_Exceptions;

public class Exception_handling {
static String name; 

	public static void main(String[] args) {

		 myData();
		 myMethod();
	}
	public static void myData() {
		
		try {
			int [] numbers = { 20, 30,4 };
			
			System.out.println(numbers[2]);
			
			int a = 20;
			int b = 0;
			System.out.println(a/b);
			
			
		
			
		} catch( ArrayIndexOutOfBoundsException e) {
			
			System.out.println("index out of bounds exception");
			
		}  catch( ArithmeticException e) {
			
			System.out.println(" arithmetic excpetion occurred");
			
		}  catch (Exception e) {
			
			System.out.println("problem removed");
		}
	}
	
	public static void myMethod() {
		System.out.println("it id my method code");
		try {
		System.out.println(name.length());
		} catch (Exception e) { 
			System.out.println("excption solved");
		}
	}
	
	

}
