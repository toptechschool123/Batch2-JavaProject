package day_12;

public class Methods_of_String {

	public static void main(String[] args) {

		String name = "seattle";
		String name2 = "seattle";
		int a = 40;
		int b = 60; 
	//toLowerCase();
	//	toUpperCAse();
		
		if ( a == b) {
			System.out.println("it is false");
		} else System.out.println("it is true");
		
		name.toLowerCase();
		System.out.println(name.toLowerCase());
		
		name.toUpperCase();
		System.out.println(name.toUpperCase());
		
		name.length();
		System.out.println(name.length());
		
		name.charAt(4);
		System.out.println(name.charAt(4));
		
		name.trim();
		System.out.println(name.trim());
		
		name.concat("USA");
		System.out.println(name.concat("USA"));
		
		name.isEmpty();
		System.out.println(name.isEmpty());
		
		name.contains("Seattle");
		System.out.println(name.contains("Seattle"));
		
		name.startsWith("S");
		System.out.println(name.startsWith("S"));
		
		name.equals(name2);
		System.out.println(name.equals(name2));
		
		name.equalsIgnoreCase(name2);
		System.out.println(name.equalsIgnoreCase(name2));
		
		name.indexOf("S");
		System.out.println(name.indexOf("S"));
		
		
		if( name.equals(name2)) {
			System.out.println("it is true");
		
		}
		else System.out.println("it is false");
	}

}
