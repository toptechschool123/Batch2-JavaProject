package day_20_Map_interface;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmap1 {

	public static void main(String[] args) {


		HashMap <String , String > m  = new HashMap <String, String>();
		
		m.put("empName", " Jawid");
		m.put("empAdd", "Seattle");
		m.put("empRole", "Manager");
		
		System.out.println(m);
		
		// store data in the form of key and value
		
		// table 
		
		// empName   = Jawid
		// empAdd   =  Seattle
		// empRole  =  manager
		
		// 1   ---- Student
		// 2   ----- Teacher 
		///3   ----- Manager
		
		HashMap <Integer, String> h = new HashMap <Integer, String>();
		
		h.put(1, "Tom");
		h.put(2, "John");
		h.put(3, "Liz");
		System.out.println(h);
		
	/*	for(Object h : c) {
			System.out.println(h);*/
		
		
		
		
		}

	}


