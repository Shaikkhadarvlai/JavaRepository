package controlFlowStatement;

public class LoopDemo {

	public static void main(String[] args)
	{

		//for loop
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		System.out.println("*********************");
		
		//print 1 to 10 numbers
			
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("*****************");
		//print 10 to 1
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("*****************");
		
//		for(;;)//by default condition is true
//		{
//			System.out.println("Hi");
//		}
//		
		//while loop
		
		int i=1;
		while(i<=5)
		{
			System.out.println("Welcome All");
			i++;
		}
		
		System.out.println("**************************");
		//Sum of digits num=123==1+2+3=6
		
		int num=123,r,sum=0;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r;
			
		}
		
		System.out.println("Sum of digits for number 123: "+sum);
		
		
		System.out.println("**********************************");
		
		//do-while
		int j=1;
		do
		{
			System.out.println("Hello All");
			j++;
		}while(j<=5);
		
		

	}

}