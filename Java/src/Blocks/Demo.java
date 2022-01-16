 package Blocks;

public class Demo {

public static void main(String[] args) {
		
		
		System.out.println("I m in the main method ");
		
		Demo d = new Demo();
		d.test();
	}
	


	
	{
		System.out.println("I m in the instance block");
	}

	
	public void test() {
		
		System.out.println("I m in the test method");
	}
	
	static
	{
		System.out.println("I m in the static block");
	}
}
