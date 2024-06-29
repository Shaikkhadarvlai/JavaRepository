package oop.Inheritance;


class A
{
	public void m1()
	{
		System.out.println("M1() calling from A class");
	}
	
}

class B extends A//A is parent for B-Single level Inheritance
{
	public void m2()
	{
		System.out.println("M2() calling from B class");
	}
	
}

class C extends B//B is parent for C-Multilevel Inheritance
{
	public void m3()
	{
		System.out.println("M3() is calling from C Class");
	}
}

class D extends A//A is parent for D- Hierarchical Inheritance
{
	public void m4()
	{
		System.out.println("M4() is calling from C Class");
	}
}

//class x extends B,D
/*
 * Multiple inheritance not supported in java directly
 * Solution is Interface
 */


public class InheritanceDemo {

	public static void main(String[] args)
	{
		
		System.out.println("Parent class ref and Parent class object");
		
		A a1=new A();
		a1.m1();// Individual method
		
		
		System.out.println("*********************");
		System.out.println("child class ref and child class object");
		B b1=new B();
		b1.m2();// Individual method
		b1.m1();//Inherited method
		System.out.println("*********************");

		System.out.println("Parent class ref and Child class Object=(ref)");
		A a2=new B();
		a2.m1();
		System.out.println("*********************");

		
		System.out.println("Child class ref and Parent class Object=(Invalid)");

		//B b2=new A();//Type mismatch: cannot convert from A to B
		
		
	
//		System.out.println("*********************");
//		
//		C c1=new C();
//		c1.m1();//Inherited method
//		c1.m2();//Inherited method
//		c1.m3();// Individual method
//		
//		System.out.println("*********************");
//		
//		D d1=new D();
//		d1.m1();//inherited method
//		d1.m4();//Individual method

	}

}