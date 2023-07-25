package day_17_ThrowsAnd_Throw_Keyword;

import java.io.File;
import java.io.IOException;

public class Throws_keyword {
	// checked exception
	public static void main(String[] args) throws IOException  {

		createFile();
		createFile2();
		try {
		createFile3();
		} catch (IOException e) {
			System.out.println("it is io exception happened");
		}
	}
	
	public static void createFile() {
		
		File f = new File("note.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static void createFile2() throws IOException  {
			
			File f = new File ("book.txt");
			f.createNewFile();
		
	}
		
		public static void createFile3() throws IOException {
			File f  = new File("");
			f.createNewFile();
		}
		
	

}
