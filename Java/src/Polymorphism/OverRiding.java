package Polymorphism;

class Animal{
	
	public void move() {
		
		System.out.println("Animal can move");
	}
	
}

class Dog extends Animal{
	
	public void move() {
		
		System.out.println("Dog can move and walk");
	}
	
	
}


public class OverRiding {

	public static void main(String[] args) {

		Animal a = new Animal();
		Animal b = new Dog();
		a.move();
		b.move();
		

	}

}
