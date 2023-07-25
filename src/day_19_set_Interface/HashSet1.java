package day_19_set_Interface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {


		// Set interface
		
		// set interface has two implementing classes
		// HashSet
		// LinkedHashSet
		
		// ctrl+shift+o =imports util package
		
		// HashSet does not store duplicate values
		// HashSet does not keep insertion order
		
		
		
		HashSet h = new HashSet();
		
	//ArrayList h = new ArrayList();
		
		h.add("book");
		h.add("pen");
		h.add(10);
		h.add(false); // boolean -- true, false
		h.add(null);
		h.add('A');
		h.add("book");
		
		System.out.println(h);
		
		HashSet <Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		
		System.out.println(s);
		
		HashSet <String> e = new HashSet<String>();
		e.add("name");
		e.add("lastName");
		e.add("firstname");
		
		System.out.println(e);
		
		Set x = new HashSet();
		x.add(20);
		x.add("name");
		x.add("book");
		
		LinkedHashSet k = new LinkedHashSet();
		
		k.add(20);
		k.add("book");
		k.add("class");
		System.out.println(k);
		
		
	
	}

}
