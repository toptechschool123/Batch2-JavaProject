package day_16_Exceptions;

public class Exceptions {
    static String name;

	public static void main(String[] args) {

		Exceptions x = new Exceptions();
		x.myData();

		x.myMethod();
		x.empData();

	//	try -catch block
		// arithmetic exceptioin
		//ArrayIndexOutOfBoundsException
		// NullPointerException
	}

	public void myData() {
 
		try {
			int a = 20;
			int b = 0;

			System.out.println(a / b);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		
	}

	public void myMethod() {
 try {
	 int [] a = { 1, 2, 3, 4 };
		
		System.out.println(a[7]);
		
 }  catch (ArrayIndexOutOfBoundsException e) {
	  System.out.println("wrong password, please type your password again");
 }
		
	}
	
	public void empData() {
		try {
		System.out.println(name.length());
		} catch(NullPointerException e) {
			System.out.println(e);
		}
		
		System.out.println("it is all employee data here");
	}

}
