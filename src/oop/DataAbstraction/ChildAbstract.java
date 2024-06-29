package oop.DataAbstraction;

public class ChildAbstract extends AbstractDemo
{
//	@Override
//	public void show()
//	{
//		
//	}
	public void childM()
	{
		System.out.println("childM() This is child class individual method");
	}
	
	

 @Override
 public void show()
 {
	 System.out.println("Show() is inherited abstract method");
	 System.out.println("Show() implemented by its child class");
	
 }
 
 
 public static void main(String[] args)
	{
	 
	 //child class ref and child class object
	 ChildAbstract  c1=new  ChildAbstract();
	 c1.accept();//inherited
	 c1.childM();//individual
	 c1.show();//inherited abstract method-override
	 
	 //parent class ref and parent class object-Invalid
	 //Cannot instantiate the type AbstractDemo
		//AbstractDemo d1=new AbstractDemo();
		
	 
	//parent class ref and child class Object
	 
	 AbstractDemo d1=new ChildAbstract();
	 d1.accept();
	 d1.show();
	 
	 //child class ref and parent object=Invalid
	}
 
 
 
 

}