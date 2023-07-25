package day_4;

public class Ternary_Operator {

	public static void main(String[] args) {


		int time = 20;
		
		String result = (time< 150) ? "Good day" : " Good evening";
		System.out.println(result);
		
		
		String maxNum = (20>30)? " it is right" : " it is not right";
		System.out.println(maxNum);
		
		
		
		String  largeNum = (40>30) ? " it is right" : "it is not right";
		System.out.println(largeNum);
		
		int a = 50;
		int b = 60;
		
		String number =(a >b) ? " a is not more than b" : " b is more than a";
		System.out.println(number);
	}     

}
