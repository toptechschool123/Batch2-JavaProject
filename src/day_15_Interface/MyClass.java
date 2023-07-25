package day_15_Interface;

public class MyClass implements Interface1 {

	public static void main(String[] args) {
		MyClass c = new MyClass();
		c.myData();
		c.myMethod();
		c.empData();
		Interface1.empRole();

	}

	@Override
	public void myData() {
		System.out.println("hello");
	}

	@Override
	public void myMethod() {

		System.out.println("hi");
	}

}
