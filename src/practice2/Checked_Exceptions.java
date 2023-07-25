package practice2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Checked_Exceptions {

	

	  public static void main(String[] args) {
	    checkAge(40); // Set age to 15 (which is below 18...)
	    
	   
	  }
	  
	  
	  static void checkAge(int age)throws ArithmeticException {
		  if(age<19) {
			  
			  throw new ArithmeticException("access denied");
		  } else {
			  System.out.println("access granted");
		  }
		  
		  
		  
	  }
	  
	  
	}
