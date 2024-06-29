package exceptionHandling;

import java.util.Scanner;

public class RunTimeExceptions 
{
	int id=101;
	

	public static void main(String[] args)
	{
		
		RunTimeExceptions  r1=null;
		try {
		System.out.println("Id is: "+r1.id);//NullPointerException
		}catch(NullPointerException n)
		{
			System.out.println("Current class object is null");
		}
		
		
		
		

//		String s1="100AB";
//		try {
//		int num=Integer.parseInt(s1);//NumberFormatException
//		System.out.println(num);
//		}catch(NumberFormatException n)
//		{
//			System.out.println("Please provid valid parsable string ");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter index between 0 to 5");
//			int index=sc.nextInt();
//			
//			
//			int arr[]= {10,20,30,40,50,60};
//			try {
//			System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
//			}catch(Exception e)
//			{
//				System.out.println("Please provide valid index from given value");
//			}
//			sc.close();
			
		
		
		
		
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter two numbers: ");
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			
//			System.out.println("Addition is: "+(a+b));
//			System.out.println("Subtraction is: "+(a-b));
//			try {
//			System.out.println("Division is: "+(a/b));//ArithmeticException
//			}catch(ArithmeticException obj)
//			{
//				System.out.println("Please provide number other than 0 Division"+ obj.getMessage());
//			}
//			System.out.println("Multiplication is: "+(a*b));
//			
//			sc.close();
			
			
			
			
		

	}

}