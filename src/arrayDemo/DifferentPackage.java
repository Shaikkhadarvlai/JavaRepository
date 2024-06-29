package arrayDemo;

import week1.*;//only for classes

public class DifferentPackage extends AccessModifierDemo{

	public static void main(String[] args) 
	{

		AccessModifierDemo a3=new AccessModifierDemo ();
		System.out.println(a3.name);
		
		//child class
		DifferentPackage d=new DifferentPackage();
		System.out.println("Protected data:"+ d.acno);
		System.out.println(d.name);
		

	}

}