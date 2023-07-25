package day_20_Map_interface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class For_eachLoop {

	public static void main(String[] args) {

		
		myData();
		myHashMap();

		}

		
		public static void myData() {
			
			
			Map n = new Hashtable<Integer, String>();
			
			n.put(1, "Name");
			n.put(2, "lastName");
			n.put(3, "address");
			n.put(4, "city");
			//n.put(null, "country");
			//n.put(null, "state");
			
			System.out.println(n);
		

	}
		
		public static void myHashMap() {
			
		
		
		Map m = new HashMap<Integer, String>();

		m.put(1, "Name");
		m.put(2, "lastName");
		m.put(3, "address");
		m.put(4, "city");
		m.put(null, "country");
		m.put(null, "state");
		m.put(null, "continent");
		for (Object i : m.keySet()) {
			System.out.println(i + "  " + m.get(i));
			
		}}
}
