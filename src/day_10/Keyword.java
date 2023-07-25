package day_10;

public class Keyword {
	String f ; // null
	int g ; // 0
	int x = 40; // instance variable 
	String name = "sdet";
	double wage = 404.4;
	
	static int salary = 600; // class variable 
	static String address = "seattle";
	// static : I belong to directly to the class neither object nor local/method
	
	public static void main(String[] args) {
		
		
		Keyword s = new Keyword();
		
		s.myMethod();
		s.myMethod2();
		myMethod3();  // we can direclty call the method name  or by className, if it has static keyword
		Keyword.myMethod3();
		s.myMethod3(); // it is not the proper way to call a static method by object reference
		s.myMethod4();
		myMethod4();
		
		System.out.println(s.g);
		System.out.println(s.x);
		System.out.println(s.name);
		System.out.println(s.wage);
	   System.out.println(s.f);
		System.out.println(salary);
		System.out.println(address);
	}
	
	void myMethod() {
		 int a = 40; // local variable 
		String name = "book";
		System.out.println(name);
		System.out.println("Hi");
		
		
	}
	
	public void myMethod2() {
		double wage = 20 ; // does not have  default value 
		System.out.println(wage);
	}
	
	static void myMethod3() {
		System.out.println("it is static keyword");
	}
	
	public static void myMethod4() {
		String y = " usa";
		int  x = 444	;
		
		System.out.println(y);
		System.out.println(x);
	}

}
