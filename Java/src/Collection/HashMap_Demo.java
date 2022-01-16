package Collection;

import java.util.HashMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		
		
		//Duplicate keys are not allowed but values can be duplicated
		//Map Stores values in Key Value Pairs
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Akash", "Suryawanshi");
		map.put("swapnil", "Gaikwad");
		map.put("Akash", "Suryawanshi");
		map.put("Ganesh", "Suryawanshi");
		System.out.println(map);
		

	}

}
