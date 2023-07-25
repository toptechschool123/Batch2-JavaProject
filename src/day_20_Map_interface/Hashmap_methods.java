package day_20_Map_interface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashmap_methods {

	public static void main(String[] args) {


		// put()
		
		Map m = new HashMap<Integer, String> ();
		
		m.put(1, "Name");
		m.put(2, "lastName");
		m.put(3, "address");
		m.put(4, "city");
		
		
		// get();
		m.get(4);
		System.out.println(m.get(4));
		
		// remove()
		
		m.remove(1);
		System.out.println(m);
		// containsKey(); // true and false
		System.out.println(m.containsKey(22));
		// containsValue();
		
		System.out.println(m.containsValue("Name"));
		
		// isEmpty(); 
		System.out.println(m.isEmpty());
		// size()
		System.out.println(m.size());
		
		// keySet()
		System.out.println(m.keySet());
		//
		
		// values();
		System.out.println(m.values());
		
	
		
		// entrySet()
		System.out.println(m.entrySet());

	
		
		// putAll()
		
		HashMap <String, String> s  = new HashMap<String, String> ();
		
		s.put("name", "tom");
		s.put("city", "seattle");
		s.put("role", "sdet");
		
		m.putAll(s);
		
		System.out.println(m);
		
		
			
			//m.clear();
			System.out.println(m);
			
		
	}
}

