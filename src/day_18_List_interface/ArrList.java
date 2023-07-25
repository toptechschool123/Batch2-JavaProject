package day_18_List_interface;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		
	//	int []	c = {10, 20,};
		
		
		ArrayList ar = new ArrayList();
		
		// add();
		
		// book, pen, 10, A
		
		ar.add("book");
		ar.add("pen");
		ar.add(10);
		ar.add('A');
		ar.add("pen");
		
		System.out.println(ar);
		
		ArrayList b = new ArrayList();
		b.add(10);
		b.add(20);
		b.add(30);
		
		System.out.println(b);
	
		// remove();
		//get();
		// size();
		//set();
		//contain();
		b.remove(0);
		
		System.out.println(b.remove(0));
		
		
		
	}

}
