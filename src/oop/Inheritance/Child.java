package oop.Inheritance;

public class Child extends Parent

{
	int cid=201;
	
	public void childIncome()
	{
		System.out.println("Parent id is: "+super.pid);
		super.parentIncome();
		System.out.println("Child id is: "+cid);
		System.out.println("Child income is $90000");
	}
	
	public Child()
	{
		super();//super constructor
		System.out.println("This is default constructor from child");
	}
	

	public static void main(String[] args)
	{
			Child c1=new Child();
			c1.childIncome();

	}

}