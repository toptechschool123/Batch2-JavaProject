package day_15_Abstract_Class;

public class Child extends Home_Abstract {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.myData();
		c.myMethod();

	}

	@Override
	public void myData() {
		System.out.println("hi");
		
	}

	@Override
	public void myMethod() {
		System.out.println("hello");
		
	}

	@Override
	public void empData() {
		// TODO Auto-generated method stub
		
	}

}
