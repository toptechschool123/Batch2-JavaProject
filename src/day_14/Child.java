package day_14;

public class Child extends Parent{ // single inheritance
 String name = "book";
	public static void main(String[] args) {

		 Child c = new Child();
		 
		 
		 c.myData();
		 c.myMethod();
		 System.out.println(c.name);
		 c.myData2();
		
	}
	
	public void myData() {  // method overriding  
							// method overloading 
		super.myData();					// this = refer to the object of the current class
		System.out.println(super.name);				// super = refers to the member of the parent class
		
		System.out.println("it is myData method in child class");
	}
	
  

}
