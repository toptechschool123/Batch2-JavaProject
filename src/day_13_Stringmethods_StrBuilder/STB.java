package day_13_Stringmethods_StrBuilder;

public class STB {

	public static void main(String[] args) {

// StringBuilder class is an mutable class while String is immutable 
		
	String name = "book";
	
	//System.out.println(name);
	
	///String name1 = new String ("note");
	
	
	
		
		StringBuilder sb = new StringBuilder ("book");
		
		System.out.println(sb);
		
		
		
	
		// toString()
		String s = sb.toString();
		System.out.println(s);
		
		// replace();
		System.out.println(sb.replace(0, 1,"B"));
		
		// append()
		// reverse();
		
		
		System.out.println(sb.append("note"));	
		
		System.out.println(sb.append("this"));
	
		
		
		// insert();
		System.out.println(sb.insert(0, "My"));
		
		
		//System.out.println(sb.reverse());
		
		sb.delete(0, 2);
		System.out.println(sb.delete(0, 3));
	}

}
