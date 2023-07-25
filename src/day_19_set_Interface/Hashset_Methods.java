package day_19_set_Interface;

import java.util.HashSet;

public class Hashset_Methods {

	public static void main(String[] args) {


		HashSet h = new HashSet();
		
		h.add("apple");
		h.add("orange");
		h.add("banana");
		h.add("pears");
		
		HashSet t = new HashSet();
		
		t.add(10);
		t.add(20);
		t.add(30);
		
		System.out.println(h);
		
		h.remove("apple");
		
		System.out.println(h);
		System.out.println("**********");
		System.out.println(h.contains("pears")); // true  or false
		h.addAll(t);
		System.out.println(h);
		
		h.removeAll(t);
		System.out.println(h);
		
		// iterate the set
		
		for(Object v : t) {
			System.out.println(v);
		}
		
		
		
	}

}
