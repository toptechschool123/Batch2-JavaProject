package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B{

	public static void main(String[] args) {
		
	List <Integer> a = new ArrayList<Integer>();
	
	a.add(103);
	a.add(203);
	a.add(30);
	
	System.out.println(a);

	Collections.sort(a);
	System.out.println(a);
	
	Collections.reverseOrder();
	System.out.println(a);
	}

}
