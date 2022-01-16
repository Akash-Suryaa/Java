package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {
		
		// Data is not added in indexing order
		//Duplicates not allowed
		HashSet<String> h = new HashSet<String>();
		
		h.add("Akash");
		h.add("Ganesh");
		h.add("Swapnil");
		h.add("Ganesh");
		h.add("Akash");
		h.add("Kapil");
       
		System.out.println(h);
		
		//itereting with for each loop
		for(String str :h) {
			System.out.println(str);
		}
		
		// iterating with iterator
		Iterator<String> str1 =h.iterator();
		while(str1.hasNext()) {
			System.out.println(str1.next());
		}
		
		
		
		
	}

}
