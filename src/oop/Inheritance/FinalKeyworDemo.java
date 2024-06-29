package oop.Inheritance;

//final class Demo
class Demo
{
	final int x=100;
	
	public final void color()
	{
		System.out.println("Color is Red");
	}
}



//The type FinalKeyworDemo cannot subclass the final class Demo
public class FinalKeyworDemo extends Demo
{
//	@Override
//	public void color()//Cannot override the final method from Demo
//	{
//		System.out.println("Color is Blue");
//	}

	public static void main(String[] args)
	{
		FinalKeyworDemo f1=new FinalKeyworDemo();
		System.out.println(f1.x);//100
		//f1.x=500;//The final field Demo.x cannot be assigned
		f1.color();
		System.out.println(f1.x);//500

	}

}