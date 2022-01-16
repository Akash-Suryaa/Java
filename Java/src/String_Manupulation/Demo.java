package String_Manupulation;

public class Demo {

	public static void main(String[] args) {
		
		
		String str = "Akash is Selenium Test Engineer";
		String str1 ="Akash is selenium Test Engineer";
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		
		System.out.println(str.indexOf('s'));  // 1st occurence
		System.out.println(str.indexOf('s', str.indexOf('s') +1));
		
		//.equal method is used to compare two strings
		
		//return false  because java is case sensitive language
		System.out.println(str.equals(str1)); //
		
		System.out.println(str.equalsIgnoreCase(str1)); 
		
		String s = "  Akash Jalindar Suryawanshi ";
		System.out.println(s.trim());// trim will remove the spaces only start and end of the String
                                     // Not in the middle of the String
		
		// for removing the middle space replace() method 
  		
		System.out.println(s.replace(" ", ""));
		
		String s1 = "28-06-1995";
		System.out.println(s1.replace("-", "/"));
		
		//Split String
		String test = "Akash_Jalindar_Suryawanshi";
		String testvalue [] =test.split("_");
		for(int i=0;i<testvalue.length;i++) {
			System.out.println(testvalue[i]);
			
		}
		
		String test1 = "Akash Jalindar Suryawanshi";
		String testval [] =test1.split(" ");
		for(int i=0;i<testvalue.length;i++) {
			System.out.println(testvalue[i]);
		
	}
		String a ="Hello";
		String b = "World";
		int c = 10;
		int d= 20;
		
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(a+b+c+d);
		System.out.println(a+b+(c+d));

}
}