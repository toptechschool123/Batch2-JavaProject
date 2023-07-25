package day_11;

public class Method_overloading {
 // instantiate 
	public static void main(String[] args) {
 // when we have couple methods with the same name but different parameters, it is called method-overloading
		Method_overloading m  = new Method_overloading();
		m.myMethod();
		m.myMethod(300);
		m.myMethod("notebook");
		
	}
	
	public void myMethod() {
		
		System.out.println("hello");
	}
	
	public void myMethod(int a) {
		
		System.out.println(a);
	}
	
	public void myMethod(String b) {
		System.out.println(b);
	}
	
	public void myMethod( String name, int x) {
		
	}
	
	public void myMethod( int h, String d) {
		
	}

}
