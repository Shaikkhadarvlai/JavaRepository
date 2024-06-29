package oop.Polymorphism;

public class RuntimePolymorphism {

	public static void main(String[] args) 
	{

		//parent class ref and parent class object==>parent
		Parent p1=new Parent();
		p1.color();//red
		
		
		//child class ref and child class object=Parent+child
		
		Child c1=new Child();
		c1.color();//yellow
		
		//parent ref and child object --->ref matter (parent)
		
		//Parent class method is overrided by child
		Child p2=new Child();
		p2.color();//yellow
		
		

		
		

	}

}