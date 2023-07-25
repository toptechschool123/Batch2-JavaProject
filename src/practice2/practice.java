package practice2;

public class practice {
 static String name ; 
	public static void main(String[] args) {
		
		practice p = new practice();
		System.out.println(name.length());
		p.myData();
		p.myArray();
		
		
	}
	
	
	public void myData() {
		System.out.println("it is begining of the method ");
		
		// Arithmatic Exception
		// array indixe out of bounds exception
		// null pointer exception
		int a, b;
		a = 40;
		b = 0;
		System.out.println(a/b);
		
		System.out.println("it is end of the method");
	}
	
	public void myArray() {
		
		String [] names = {"pen", "book", "pencil" };
		System.out.println(names[2]);
	}
	
}
	


