package day_13_Stringmethods_StrBuilder;

public class B extends A {

	public static void main(String[] args) {
		
		
		B b = new B ();
		
		b.getName();
		System.out.println(b.getName());
		
		b.myLecture();
		

	}
	
	public void myLecture() {
		System.out.println("it is B class");
		super.myLecture();
	}

}
