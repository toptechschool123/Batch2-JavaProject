package day_16_Exceptions;

public class Finaly_Block {

	public static void main(String[] args) {

		myMethod();
	}



	public static void myMethod() {
		try {
			
			int[] a = { 1, 2, 3, 4 };

			System.out.println(a[2]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("wrong password, please type your password again");
			
			
		} finally {
			System.out.println("it is finally block");
		}

	}
}
