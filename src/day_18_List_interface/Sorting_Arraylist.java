package day_18_List_interface;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Arraylist {

	public static void main(String[] args) {


		ArrayList <Integer> ar = new ArrayList <Integer>();
		
		ar.add(100);
		ar.add(200);
		ar.add(30);
		ar.add(10);
		ar.add(500);
		
		
		System.out.println(ar);
		
		// collections class
		
		// sort();
		
		Collections.sort(ar);
		
		for(int v : ar) {
			System.out.println(ar);
		}

	}

}
