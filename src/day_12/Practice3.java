package day_12;

public class Practice3 {

	public static void main(String[] args) {

		
		StringBuilder sb = new StringBuilder("book");
		
		System.out.println(sb);
		
		
	
		
		// append
		
		sb.append("note");
		System.out.println(sb);
		
		// insert();
		
		sb.insert(0, "Note");
		System.out.println(sb);
		
	
		
		sb.replace(0,4, "this");
		System.out.println(sb);
		
		sb.delete(0, 4);
		System.out.println(sb);
	
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		String s =  sb.toString();
		System.out.println(sb);
		
	

	sb.reverse();
		System.out.println(sb);
		
		String a = "book";
		String b = "book";
		
		String c = "pen";
		String d = new String ("pen");
		
		System.out.println(c.equals(d));
		System.out.println(c == d);
		
		
		System.out.println(a==b);
		
		System.out.println();

		 String x = "alpha+beta+gama+delta+sigma";
		 String [] words = x.split("  " , 2);
		 
		 for(String v: words) {
			 System.out.println(v);
		 }
		
		
	}

}
