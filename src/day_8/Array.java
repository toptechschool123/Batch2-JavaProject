package day_8;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int []	 nums = new int[5];
		
		
		
		
		// apple , orange, pear
		// cherry, banana, melon
		String [][]	names =  { { "apple", "orange", "pear" }, {"cherry", "banana", "melon"}};
		
		String [][] fruits = new String [2][3];
		
		// pen , book eraser
		// chalk board, duster
		fruits[0][0] = "pen";
		fruits[0][1] = "book";
		fruits[0][2] = " eraser";
		fruits[1][0] = "chalk";
		fruits[1][1]= "board";
		fruits[1][2]= " dusters";
		
		//System.out.println(fruits[1][2]);
		
		// two for loop or nested for loop
		// length
		for(int i =0; i<2; i++) {
			for(int j = 0; j<3; j++) {
				 
			//	System.out.print(fruits[i][j] + " ");
			}
			System.out.println();
		}
		
		// object array used for different data types: 
		
		Object [][]	data = { { 3, "apple", 'a', 2.2 } , { "apple", 2.4, 30, 'c'} };
		
		//System.out.println(data[1][2]);
		
		for(int y = 0; y<2; y++) {
			for(int x= 0; x<4; x++) {
				
				System.out.print(data[y][x] + " ");
			}
			System.out.println();
		}
		
		int []	 numbers = { 9, 3, 5, 1};
		
		// sort an array; we use Arrays class
		Arrays.sort(numbers);
		
		for(int n =0; n<numbers.length; n++) {
			System.out.print(numbers[n] + " ");
		}
		 System.out.println();
	}

}
