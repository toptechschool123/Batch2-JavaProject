package practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checked_Exception3 {

	public static void main(String[] args) throws IOException  {
		try {
		checkedException();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		
	}
	
	public static void checkedException() throws IOException {
		
	//	FileInputStream fe = new FileInputStream("C:/Users/T540p/Desktop/note.txt");
		FileReader f = new FileReader("C:/Users/T540p/Desktop/note.txt");
		
	}

}
