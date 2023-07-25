package day_20_Map_interface;

import java.util.Hashtable;

public class Hashtable1 {

	public static void main(String[] args) {


		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
	
		h.put(1, "student");
		h.put(2, "teacher");
		h.put(3, "manager");
		h.put(4, "director"	);
		
		System.out.println(h);

		Hashtable <String, String> s = new Hashtable<String, String>();
		
		s.put("name", "Tom");
		s.put("lastName", "Tommy");
		s.put("address", "seattle");
		
		System.out.println(s);
	}

}
