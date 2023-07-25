package day_12;

public class Equality_In_Java {

	public static void main(String[] args) {
		int a = 30;
		int b = 40;
		
		
		String name = "book";
		String name2 = "Book";
 
		if( name.equals(name2)) {
			System.out.println("it is true");
		
		}
		else System.out.println("it is false");
	
	
	
	if( name.equalsIgnoreCase(name2)) {
		System.out.println("it is true");
	
	}
	else System.out.println("it is false");
	

	if(a == b) {
		System.out.println("yes");
	} 
	else System.out.println("no");
	
	
	
}}