package day_9;

public class Method_returnType {

	public static void main(String[] args) {

		Method_returnType n = new Method_returnType();
		
		n.myMethod2();
		n.myMethod3();

	}
	
	public void myMethod() {
		
		int x = 50;
		
	}
	
	public int myMethod2() {
	
	int a = 30;
	System.out.println(a);
	
	
	 return a;
	}
	
	public String myMethod3() {
		String name = " school";
		System.out.println(name);
		return name;
	}
}
