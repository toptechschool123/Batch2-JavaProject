package day_7;

public class Object_Array {

	public static void main(String[] args) {


		// 4, book, apple, A, 4.4, true;
		
		//String [] names = { 4, "book", "apple", 'A', 4.4, true };
		
		
		// To store different different data types in an array we use object array 
		
		Object [] data = { 4, "book", "apple", 'A', 4.4 , true};
		
		System.out.println(data[5]);
		
		// for each loop
		
		for(Object y : data) { 
			System.out.println(y);
		}
		
		
	}

}
