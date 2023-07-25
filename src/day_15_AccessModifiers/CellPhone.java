package day_15_AccessModifiers;

public  class CellPhone {


	protected String empRole = "Manager";
	
	
	
	 
	
	
	public static void main(String[] args) {
		CellPhone c = new CellPhone();
	
		String name ;
		name = "karim";
		name = "rahimi";
		System.out.println(name);
	
	}
	
	public void myData() {
		System.out.println("it is myData in Cellphone class");
	}
	
	void myMethod() {
		System.out.println("it my mthoed in cellphone class ");
	}

}
