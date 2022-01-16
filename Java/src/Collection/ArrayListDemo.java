package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//contains only String not other data types
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Kuldip");
		list1.add("jalindar");
		list1.add("Suryawanshi");
		System.out.println(list1);
		
		//contains any data type and String
		ArrayList list2 = new ArrayList();
        
		list2.add(10);
		list2.add("Akash");
		list2.add("Akash");
		list2.add("20");
		
		System.out.println("The list is " + list2);
		
		
		//Get the element From list2
		
		Object name =list2.get(1);
		System.out.println("The name is " + name );
		
		//update an element
	Object name1=	list2.set(2, "Swapnil");
		
		System.out.println("After updating the list is " + list2);
	
		
		
		//remove the element
		
	Object remove =	list2.remove(2);
	System.out.println("The list after removing the element" + list2);
	
		// Using contains method
	if(list2.contains("Akash")) {
		System.out.println("Akash is in List");
	}
	
	//Iterating list2 with enhanced For loop
	System.out.println("Iterating the list2");
	for(Object str:list2) {
		System.out.println(str);
	}
	
	//Iterating with for loop
	
	for (int i =0;i<list2.size();i++) {
		System.out.println(list2.get(i));
		
	}
	
	//Iterating with iterartor
	System.out.println("====Iterating with hasnext()");
Iterator itr1 =	list2.iterator();
	//itr.hasNext();
	System.out.println(itr1.next());
	
	//next method gives only one element
	//iterate all the list we have to use while loop
	System.out.println("====Iterating with Iterator");
	Iterator itr =	list2.iterator();
	while(itr.hasNext()) {
	Object str =	itr.next();
	System.out.println(str);
	
	}
	
	
	
	
	}

}
