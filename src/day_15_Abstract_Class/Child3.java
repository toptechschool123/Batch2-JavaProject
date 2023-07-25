package day_15_Abstract_Class;

public class Child3 extends Abstract2{

	public static void main(String[] args) {

		Child3 c = new Child3();
		c.myData();
		c.myMeth();
	}

	@Override
	void myMeth() {
		System.out.println("hello");
		
	}

}
