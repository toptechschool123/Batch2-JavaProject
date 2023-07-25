package day_11;

public class Constructor {
	
	//A constructor in Java is similar to a method that is invoked when an object of the class is created.
	// constructor name should be like class name and it does not have return type
	// no-argument constructor
	// parameterized constructor
	// default constructor
   public static void main(String[] args) {
	

	Constructor c = new Constructor();
	Constructor c1 = new Constructor(100);
	Constructor c2 = new Constructor("class");
	
	c.myMethod(300);
	
}

	public Constructor() {
		
		System.out.println("it is constructor");
	}
	
	public Constructor(int a ) {
		
		System.out.println(a);
	}
	
	public Constructor(String name) {
		System.out.println(name);
	}
	
	public void myMethod(int x ) {
		System.out.println(x);
	}

}


