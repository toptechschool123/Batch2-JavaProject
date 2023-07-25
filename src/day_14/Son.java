package day_14;

public class Son extends Father {
int age = 10;
String name = "pen";
	public static void main(String[] args) {

		Son s = new Son();
		s.myMethod();
		s.myData();
		
		System.out.println(s.age);
		System.out.println(s.name);
		
	

	}
	
	public void myMethod() {
		
		System.out.println(" it is a method");
		System.out.println(super.age);
		System.out.println(super.name);
		super.myData();
	}
	
	public void myData() {
		System.out.println("it is Son class");
		
		
	}
	
	

}
