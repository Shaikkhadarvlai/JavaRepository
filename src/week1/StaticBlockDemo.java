package week1;

public class StaticBlockDemo 
{
	
	static String cname="aaaa";
	
	//static block
	static 
	{
		System.out.println("This is static block calling!");
		System.out.println("Static block is used to initialize static variable");
		cname="AISSPMS";
	}

	public static void main(String[] args) 
	{

		System.out.println("This is main calling!");
		System.out.println(cname);

	}

}