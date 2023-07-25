package day_19_set_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Iterate_Hashset {

	public static void main(String[] args) {


		HashSet<Integer> h = new HashSet<Integer>();
		
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		
		
		Iterator<Integer> i = h.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
		
		// for-each loop
		
		for(Integer s: h) {
			System.out.println(s);
			
		}
		
		
		LinkedHashSet <String> v = new LinkedHashSet<String>();
		
		v.add("empName");
		v.add("empDOB");
		v.add("empWage");
		
		for(String x : v) {
			System.out.println(x);
		}
		
		
		// Iterator
		// next()
		//hasNext();
		System.out.println("*************************");
		
		Iterator it = v.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		

	}

}
