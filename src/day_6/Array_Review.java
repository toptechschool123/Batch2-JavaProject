package day_6;

public class Array_Review {

	public static void main(String[] args) {

		int a; // variable declaration/ creation
		a = 50; // variable initialization
		int ad = 3;
		// System.out.println(a);
		// Array :

		String name;
		// System.out.println(name);
		// 10, 20, 30, 40;

		int[] numbers = { 10, 20, 30, 40 };

		for (int x : numbers) {
			System.out.println(x);
		}

		// System.out.println(numbers[3]); // exception: arrayindexoutofboundsException

		// array is static
		// kabul, seattle, paris, istanbul

		String[] cities = { "Kabul", "Seattel", "Paris", "Istanbul" };

		// System.out.println(cities[2]);

		//
		String[] fruits = new String[5]; // apple, orange, banana

		fruits[0] = " apple";
		fruits[1] = "orange";
		fruits[2] = "banana";
		fruits[3] = " pears";
		fruits[4] = "cherries";
		// System.out.println(fruits[2]);
		// arraylist. add

		// for each loop or enhanced for loop

		//for (String v : fruits) {
		//	System.out.println(v);
	//	}
		
		
		String[] fr = new String[5]; // apple, orange, banana

		fr[0] = " apple";
		fr[1] = "orange";
		fr[2] = "banana";
		fr[3] = " pears";
		fr[4] = "cherries";
		
		
		fr[2]= "watermelon";
		
		for(int i = 0; i<5;i++) {
			System.out.println(fr[i]);
		}
		
		// assign
		
		
		System.out.println("age" + 2+2);
		System.out.println(2+2 + "2");
		System.out.println("2" + 2+2);

		
	}

}
