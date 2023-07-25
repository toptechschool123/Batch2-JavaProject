package day_13_Stringmethods_StrBuilder;

public class StringBuilder2 {

	public static void main(String[] args) {


		//String name = "School";
		
		// TopTech School 
		
		StringBuilder name = new StringBuilder("School");
		
		//System.out.println(name.append("TopTech"));
		
	//	name.insert(0, "TopTech");
		
		System.out.println(name.insert(0, "TopTech"));
		
		// repalce()
		
		System.out.println(name.replace(0, 3, "TOP"));
		
		//System.out.println(name.reverse());
		
		System.out.println(name.delete(0, 2));
		System.out.println(name.deleteCharAt(1));
	}

}
