package controlFlowStatement;

public class ForLoopScenario {

	public static void main(String[] args)
	{
			//for loop with if condition
		/*
		 * print all even numbers upto 25
		 */
		for(int i=1;i<=25;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number: "+i);
			}
		}
		
		System.out.println("******************");
		
		//Nested for loop
		//print table of 2
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(5*i);
		}
		
		System.out.println("*****************************");

		
		
		for(int num=1;num<=10;num++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(num*i+"\t");
			}
			//after one row completed come to the next link
			System.out.println();
		}
		
		
		System.out.println("*************************");
		
		//reverse number
		int no=123,r,sum=0;
		while(no>0)
		{
			r=no%10;
			no=no/10;
			sum=sum*10+r;
		}
		
		
		System.out.println(sum);
		System.out.println("************************");
		
		int a=10,b=20;
		System.out.println("Before swapping a="+a+" & b="+b);
//		a=b;
//		b=a;
		//extra variable
		
//		int temp=a;//10
//		a=b;//20
//		b=temp;//10
		
		//Without extra variable +--
		
		a=a+b;//a=30
		b=a-b;//b=10
		a=a-b;//a=20
		
		
		
		
		System.out.println("After swapping a="+a+" & b="+b);
		System.out.println("************************************");
		//Pattern example
		
		for(int row=1;row<=4;row++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("***************");
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("************************");
		
	
	}

}