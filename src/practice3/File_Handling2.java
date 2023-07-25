package practice3;

import java.io.File;
import java.io.IOException;

public class File_Handling2 {

	public static void main(String[] args) throws IOException {
		
		try {
		checkedException();
		} catch (IOException e) {
			System.out.println(e);
		}
		
		myData();
	
	
		throw_keyword(5);
	
	
		
	}

	public static void checkedException() throws IOException {

		File f = new File("");

		System.out.println(f.createNewFile());

	}

	public static void myData() {

		File f = new File("note2.txt");
		f.getName();
		System.out.println("the file name is "  + f.getName());
		
		f.canRead();
		System.out.println(f.canRead());
	}
	
// throw key word
	public static void throw_keyword( int age) {
		
		if (age<20) { 
			throw new ArithmeticException ( " access denied : you are not allowed ");
		}
		else 
			System.out.println(" you are allowed in ");
		}
	}


