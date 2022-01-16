package Exception_Handling;

public class Demo {

	public static void main(String[] args)  {
		
		try {
		
		int i=10/0;
		System.out.println(i);
		
		}
		
		catch( ArithmeticException e) {
			System.out.println("Exception Handle Successfully");
			
		
		}
			
			
			catch(Exception e) {
				System.out.println("I m in the parent Exception");
			}
		
		finally {
			System.out.println("finally Block Always Executes");
		}
		
      
		
		
		
	}

}
