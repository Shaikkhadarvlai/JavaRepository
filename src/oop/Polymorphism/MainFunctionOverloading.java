package oop.Polymorphism;

public class MainFunctionOverloading 
{
	
	public static void main(int []args)
	{
		System.out.println("This is main() with int data");
	}
	
	public static void main()
	{
		System.out.println("This is main()");
	}

	public static void main(String[] args)
	{
			System.out.println("This is default main()");
			main();
			

	}

}