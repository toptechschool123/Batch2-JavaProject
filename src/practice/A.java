package practice;

import java.util.ArrayList;
import java.util.List;

public  class A {
	
	public static void main(String[] args) {
		
		
		ArrayList a = new ArrayList();
		
		a.add("apple");
		
		System.out.println(a);
		
		a.add('A');
		
		System.out.println(a);
		
		a.add(200);
		System.out.println(a);
		
		System.out.println(a.contains('a'));
		System.out.println(a.get(1));
		//a.clear();
	
		System.out.println(a);
		for (Object c : a ) {
			System.out.println(a);
		}
		
		
		List l = new ArrayList();
		l.add("pen");
		l.add('G');
		
		System.out.println(l);
		
		for(Object o: l) {
			System.out.println(l);
		}
		
		for(int i = 0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar);
		for(Integer i : ar) {
			System.out.println(ar);
		}
		
		//arraylist methods: 
		
		// add()
		// get();
		//size();
		//remove();
		//set();
		// contain();
		// clear ();
		
		/*
		 *  @ Insertion order  is preserved
			@Duplicates are allowed
			@ Any types of data can be stored
		 */
	}
	
	

	}
