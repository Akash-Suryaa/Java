package String_Manupulation;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String str = "Selenium";
		
	int length =	str.length();
		
	String rev ="";
	for(int i=length-1;i>=0;i--){
		
		rev = rev +str.charAt(i);
		//System.out.println(rev); Dont use for this line inside for lopp
		
	}
	System.out.println(rev);
	}

}
