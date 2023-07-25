package day_14;

public class Main {  // polymorphism -- upcasting

	public static void main(String[] args) {
		
		
		Animal a = new Animal ();
		a.myMethod();
		
		
		
		Animal c = new Cat(); // upcasting concept
		c.myMethod();
		
		Animal d = new Dog(); // upcasting 
		d.myMethod();
		
		
		Cat c1 =(Cat) new Animal();  //Downcasting ;  classcast Exception
		c1.myMethod();
	}

}
