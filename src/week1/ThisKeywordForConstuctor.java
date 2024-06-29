package week1;

public class ThisKeywordForConstuctor
{
	//to call constructor we use this()
	
	public ThisKeywordForConstuctor()
	{
		this(100);//parameterized
		System.out.println("This is default constructor Calling....");
		//this(100);//Constructor call must be the first statement in a constructor
	}
	
	
	public ThisKeywordForConstuctor(int number)
	{
		//this();//default
		System.out.println("This is Parameterized constructor Calling...."+number);
		
	}

	public static void main(String[] args)
	{
		ThisKeywordForConstuctor t1=new ThisKeywordForConstuctor();
		


	}

}