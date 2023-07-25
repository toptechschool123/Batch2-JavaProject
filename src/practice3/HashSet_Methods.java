package practice3;

import java.util.HashSet;

public class HashSet_Methods {

	public static void main(String[] args) {


		HashSet a = new HashSet();
		
		//	LinkedHashSet a = new LinkedHashSet();
			
			a.add("apple");
			a.add("orange");
			a.add(10);
			a.add('A');
			a.add(false);


			System.out.println(a.contains("apple"));
			
			
			HashSet <Integer> h = new HashSet<Integer>();
			h.add(10);
			h.add(20);
			h.add(30);
			h.add(40);
		
			
			
		//	a.remove("apple");
			System.out.println(a);
			
			a.add(h);
			System.out.println(a);
			
			a.addAll(h);
			System.out.println(a);
			
			//a.removeAll(a);
		//	System.out.println();
			
			
	}

}
