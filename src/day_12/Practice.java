package day_12;

public class Practice {

	// bundling of fields(variables) and methods together in a single class
	// variables are declared with private access modifier and methods are with public access modifer
	// outer class should not be able to access variables direclty unless otherwise with getter and setter methods
	 int age = 20; // default modifier - package level
	public  String name = "book";
	
	 private String address ;
	 private int rate ;
	 
	 private String city ;
	 
	 
	 
	 
	public static void main(String[] args) {

		Practice s = new Practice();
		

		System.out.println(s.address);
		
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		
		return address;
	}
	
	public int getRate() {
		return rate;
	}
	
	public void setCity(String cityName) {
		
		city = cityName;
		
		
		
	}
	
	public String getName() {
		return city;
	}

}
