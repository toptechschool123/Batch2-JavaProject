package day_11;

public class Encapsulation1 {
	
	public int a = 30;  // public access modifier
	      String b  = "class"; // default access modifier ---package level access
	
	private int x ;  // private access modifier  inside the class level access
//  public getter and setter methods
	
	private String name;
	
	
	
	public static void main(String[] args) {
		
		Encapsulation1 e = new Encapsulation1();
	
		
	}
	
	public void setMethod(int x) {
		
		this.x = x;
		
	}
		
	
	public int getMethod() {
		
		return x;
		
		


	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
