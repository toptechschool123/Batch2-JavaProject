package day_17_ThrowsAnd_Throw_Keyword;

import java.io.File;
import java.io.IOException;

public class Throws_keyword2 {

	public static void main(String[] args) {

		myData();

	}

	public static void myData() {

		File f = new File("x.txt");

		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}
	}

}
