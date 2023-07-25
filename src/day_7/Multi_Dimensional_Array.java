package day_7;

public class Multi_Dimensional_Array {

	public static void main(String[] args) {
 
		// array of arrays
		// multi-dimensional array
		// 3, 4, 5, 
		
		int [] ax ={ 3, 4, 5};
		
		 //  1 3, 4  ----> 0 0  // 1 1  / 0 1  1 1 
		//   5 6  7  ----> 
	
		
		
		int [][] nums = { { 1, 3, 4} , {5,6, 7} };
		
		//index number;
		
		/*
		 * System.out.println(nums[0][0]); System.out.println(nums[0][1]);
		 * 
		 * System.out.println(nums[0][2]);
		 * 
		 * System.out.println(nums[1][2]);
		 */
	
		// to print out the multi-dimensional array , we use two for loops: 
		
		for(int i = 0; i<nums.length; i++	) {
			
			for( int j = 0; j<nums[i].length; j++) {
				
				System.out.print(nums[i][j] + " ");
				
				
			}
			System.out.println();
		
			
		}
		
		// fruit, book, pens
		// Tom ,  Class, School
		
		String [][] names = { {"fruits", "book", "pens"}, {"Tom", "Class", "School" } };
		
	//	System.out.println(names[0][0]); // fruits
	//	System.out.println(names[1][2]);// school
		
		// we use two for loops/ nested loops
		
		for(int a = 0; a<names.length; a++) {
			for (int b = 0; b<names[a].length; b++) {
				
				System.out.print(names[a][b] + " ");
			}
				System.out.println();
				
			}
			
		}
	}


