package day_9;

public class Method_Elements {

	public static void main(String[] args) {
	//	Math.max(2, 29);
	//	Math.min(2021, 444);
		
		// access modifier, public , protected, private, default
		// how to pass parameters inside  a method
		
		Method_Elements m = new Method_Elements();
		m.method1(10, "sdet");
		m.method2("lastName", 30, 45);
		m.method3(60, 44.4, "class");
		m.method4();
		
	}
	
 public	void method1(int age , String name) {
		
		System.out.println(age);
		System.out.println(name);
	}
 
 public void method2(String name, double d, int c) {

	 System.out.println(name);
	 System.out.println(d);
	 System.out.println(c);
 }
 
 public void method3(int x, double y, String z) {
	 
	 System.out.println(x + "  "  + y  +  "  "  +  z);
	 
 }
 
 public void method4() {
	 
	 int age = 55; 
	 String name = "School";
	 
	 
	 System.out.println(age );
	 System.out.println(name);
 }
 
 

}
