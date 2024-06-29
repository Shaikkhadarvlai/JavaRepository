package oop.DataAbstraction;

public abstract class AbstractDemo
{
	/*
	 * class declare with abstract keyword
	 * Class can have implemented and non implemented
	 * Non Implemented method means method without body- abstract method
	 * When class is not fully implemented we can't create Object for that class
	 * All methods need to implement by its child class
	 * 
	 * Abstract class help you to use partial abstraction
	 * 
	 */
	//implemented
	public void accept()
	{
		System.out.println("accept() This is implemented method");
	}
	
	//abstract 
	public abstract void show();
	
	
	public static void main(String args[])
	{
		//Cannot instantiate the type AbstractDemo
		//AbstractDemo a1=new AbstractDemo();
		
	}
	
	
	
	

}