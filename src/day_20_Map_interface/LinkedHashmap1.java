package day_20_Map_interface;

import java.util.LinkedHashMap;

public class LinkedHashmap1 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> n = new LinkedHashMap<Integer, String>();

		n.put(1, "book");
		n.put(2, "notBook");
		n.put(3, "eraser");
		System.out.println(n);

	}

}
