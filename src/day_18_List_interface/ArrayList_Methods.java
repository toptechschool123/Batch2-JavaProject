package day_18_List_interface;

import java.util.*;


public class ArrayList_Methods {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		
		// integer
		// double
		// String 
		
		a.add("book");
		a.add(100);
		
		System.out.println(a);
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println(ar);
		
		ArrayList <String> b = new ArrayList<String>();
		
		b.add("book");
		b.add("pen");
		b.add("eraser");
		b.add("chart");
		System.out.println(b);
		
		b.size();
		System.out.println(b.size());
		
		System.out.println(b.get(3));
		b.set(3, "blackboard");
		System.out.println(b);
		
		System.out.println(b.contains("pen")); // true or false
		// remove();
		//get();
		// size();
		//set();
		//contain();
		b.remove(0);
		
		//System.out.println(b.remove(0));
		System.out.println(b);
		
		// List 
		
		List l = new ArrayList();
		
		l.add(1);
		l.add(2);
		l.add("house");
		l.add(2.4);
		
		System.out.println(l);
	}

}
