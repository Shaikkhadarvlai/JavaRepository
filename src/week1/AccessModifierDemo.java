package week1;

public class AccessModifierDemo 
{
	//instance variable
	int id=101;//default
	public String name="Sarang";//public 
	private long phno=979790077L;//private
	protected int acno=97979987;//protected
	/*
	 * protected data in same class,same package but in different package 
	 * only with subclass(child class) you class
	 */
	
	
	

	public static void main(String[] args)
	{
		AccessModifierDemo a1=new AccessModifierDemo();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);//same class
		


	}

}