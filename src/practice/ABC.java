package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ABC {

	public static void main(String[] args) {


		HashSet a = new HashSet();
		
	//	LinkedHashSet a = new LinkedHashSet();
		
		a.add("apple");
		a.add("orange");
		a.add(10);
		a.add('A');
		a.add(false);
		
		a.remove(false);
		
		Iterator<Object> it = a.iterator();
		
		System.out.println(it.next());
		
		
		System.out.println(a);
		
		for(Object v : a) {
			System.out.println(v);
		}
		System.out.println("**************");
		
		Iterator i = a.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
			
			
			
		
		}
		System.out.println("*************************");
		HashSet <Integer> h = new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(10);
		
		
		System.out.println(h);
		
		Set <String> s = new HashSet<String>();
		s.add("empName");
		s.add("empSalary");
		s.add("empAddress");
		
		//System.out.println(s);
		
		Iterator itt=s.iterator();
		// next()
		// hasNext();
		
		System.out.println(itt.hasNext());
		
		while(itt.hasNext()) {
			System.out.println(itt.next());
		}

		for(String v: s) {
			System.out.println(v);
		}
		
		System.out.println("PPPPPPPPPPPPPPPPPP");
		s.addAll(a);
		System.out.println(s);
	}

}
