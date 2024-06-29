package oop.Polymorphism;

import oop.Inheritance.Parent;

public class Child  extends Parent
{
	//@ - Rule (annotation)
	@Override
	public void color()
	{
		System.out.println("color is Yellow from child");
	}
	
	/*
	 * Child override parent class method
	 */
	
}