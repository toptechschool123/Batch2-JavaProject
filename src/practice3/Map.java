package practice3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Map {

	public static void main(String[] args) {


		HashMap<String, String> m = new HashMap<String, String>();
		
		HashMap n = new HashMap();
		
		n.put(1, 'A');
		n.put(2, 'B');
		n.put(3, 'C');
		n.put(null, 'D');
		n.put(null, 'E');
		
		for(Object s : n.keySet()) {
			System.out.println(s + " " + n.get(s));
		}
		System.out.println(n);
		
		m.put("fName", "karim");
		m.put("lName", "Karimi");
		m.put("Role", "manager");
		m.put(null, "Addr");
		m.put(null, "city");
		//m.put( "county");
		
		System.out.println(m);
		for(Object b : m.keySet()) {
			System.out.println(b + " " + m.get(b));
		}
		
		
		System.out.println(m);
		System.out.println(m.containsKey("fName"));
		System.out.println(m.get("Role"));
		
		m.remove("lName");
		System.out.println(m);
		
		m.putAll(n);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		
		n.clear();
		System.out.println(m);
		
		System.out.println(n);
		
		m.containsValue("lName");
		System.out.println(m);
		System.out.println(m.containsValue("lName"));
		
	Set<String> keys =	m.keySet();
	System.out.println(keys);
	
	System.out.println(m.values());

      Hashtable t = new Hashtable();;
      t.put(null, 10);
      t.put(1, "hi");
      t.put(2, "hello");
      System.out.println(t);
      
      // casting 
      int a = 30;
      byte b = (byte) a;
      long l = 3000000000l;
      int q = (int) l;
      System.out.println(q);
	}

}
