package exceptionHandling;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		/*
		 * Finally is block in java to run special code
		 * So code will run with or without exception
		 */
		
		System.out.println("Program started!");
		
		try {
			System.out.println("Division is: "+(9/0));
		}catch(ArithmeticException a)
		{
			System.out.println("Please provide valid number");
		
		}
		
		finally
		
		{
			System.out.println("Test completed!");
		}
		
		
			
		System.out.println("Program Ended!");

	}

}