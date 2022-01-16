package Contructor;

public class Demo {
	
	
	public void test() {
		System.out.println("I m in the test method");
	}

	
	public Demo() {
		
		System.out.println("I m in the contructor");
	}
	
	public static void main(String[] args) {
		
		System.out.println("I m in the main method");
		Demo d = new Demo();
		
		d.test();
		
	}
}
