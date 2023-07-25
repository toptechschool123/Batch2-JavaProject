package practice2;

public class Practice2 {

	
	public static void main(String[] args) {
		
		
		Practice2 p = new Practice2();
		p.myData();
		p.empData();
	
		
		p.myMethod();
		p.myData2();

	}
	
	public void empData() {
		System.out.println("it is empdata method");
	}
	
	
	public void myData() {
	try {
		int a , b;
		a = 20;
		b = 0;
		System.out.println(a/b);
		
	} catch (ArithmeticException e) {
		System.out.println("it is arithmetic exception");
	}
		
		
		
		System.out.println("hi it is my data method ");
	}
	
	void myMethod() {
		try {
			int[] num = {10, 20, 30, 40};
			 System.out.println(num[5]);
		} catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println(e);
		}
		System.out.println("it is arrayindex out of bounds exception");
		
	}
	
	public void myData2() {
		System.out.println("it is end of the class");
	}

}
