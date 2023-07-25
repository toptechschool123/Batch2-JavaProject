package practice2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Checked_Exception2 {

	public static void main(String[] args) {
		 try {
		        writeToFile();
		    } catch (IOException ioe) {
		        ioe.printStackTrace();
		        System.out.println("hi");
		    }

	}
	
	public static void writeToFile() throws IOException {
		  
		  BufferedWriter bw = new BufferedWriter(new FileWriter("myFile8.txt"));
		//  FileWriter w = new FileWriter("xt.txt");
		   bw.write("Testrrrrr");
		
		   
	  }
	

}
