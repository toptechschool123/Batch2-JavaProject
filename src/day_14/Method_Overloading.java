package day_14;

public class Method_Overloading {

	public static void main(String[] args) {

		Method_Overloading c = new Method_Overloading();
		c.myData("book");;

	}
	
	void myData(int a ) {
		System.out.println("hi");
	}
	
	void myData() {
		System.out.println("hello");
	}
	
	void myData(String name) {
		System.out.println(name);
	}

}
