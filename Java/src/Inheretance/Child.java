 package Inheretance;

public class Child extends Parent {
	
	public void delete() {
		
		System.out.println("Im in the delete method");
	}
	
	public void deleteAll() {
		
		System.out.println("Im in the deleteAll method");
	}
	
	public static void main(String[] args) {
		
		//Parent p = new Parent();     //call only parent method
		
	//	Parent p = new Child();        //call only parent method
	
		Child c = new Child();  // call parent as well as Child
		c.add();
		c.delete();
		
		
		
	}

}
