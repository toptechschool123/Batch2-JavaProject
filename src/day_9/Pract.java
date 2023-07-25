package day_9;

public class Pract {

	String name ;
	public static void main(String[] args) {
		
		 Pract p = new Pract();
		 Pract p1 = new Pract(2);
		 Pract p2 = new Pract("sdet");
		 Pract p3 = new Pract(300);
		 
	}
	
	Pract(){
		
		System.out.println("hi");
	}
	
	Pract(int a){
		System.out.println(a);
	}
	Pract(String name){
		this.name = name;
		System.out.println(name);
	}
	
	void method() {
		System.out.println("abc");
	}
	void method(int x) {
		
		System.out.println(x);
	}

}
