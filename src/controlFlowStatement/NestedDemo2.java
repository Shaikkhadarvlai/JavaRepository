package controlFlowStatement;

public class NestedDemo2 {

	public static void main(String[] args) 
	{

		int marks=80;
		
		if(marks>=90)
		{
			if(marks>=95)
			{
				System.out.println("A++");
			}
			else
			{
				System.out.println("A");
			}
		}else
		{
			System.out.println("B");
		}

	}

}