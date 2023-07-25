package day_11;

public class Encapsulation2 {

	
	public static void main(String[] args) {
		
		Encapsulation1 r = new Encapsulation1()	;
		
		System.out.println(r.a);
		System.out.println(r.b);
		
		r.setMethod(300);
		System.out.println(r.getMethod());
		
		r.setName("sdet");
		System.out.println(r.getName());
		
	}
	
	

}
