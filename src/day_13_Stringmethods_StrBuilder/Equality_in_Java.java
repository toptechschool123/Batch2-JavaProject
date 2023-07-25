package day_13_Stringmethods_StrBuilder;

public class Equality_in_Java {

	public static void main(String[] args) {

			String a = "book";
			String b = "book";
			
			int x = 50;
			int y = 40;
			int z = 50;
			System.out.println(x==z);
			
			
			
			String c = new String ("book");
			
			System.out.println(a==b);
			
			System.out.println(a==c);
			
			System.out.println(a.equals(c));
			
			


	}

}
