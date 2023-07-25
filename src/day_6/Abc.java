package day_6;

import java.util.Arrays;

public class Abc {

	public static void main(String[] args) {
		
		int [][] nums = { { 11, 31, 14} , {15,6, 7} };
		
	//	Arrays.sort(nums);
		
		for(int i = 0; i<nums.length; i++) {
			for(int j=0; j<3; j++) {
				
				System.out.print(nums[i][j] + " ");
			}
			
			System.out.println();
		}
		
		int [] g = { 101, 120, 30, 4, 44, 60, 0}; 
		int [] ge = { 10, 20, 30, 40, 50}; 
		System.out.println(Arrays.binarySearch(ge, 1));
		Arrays.sort(g);
		
		for(int a: g) {
			System.out.println(a);
		}
	
	}
	}