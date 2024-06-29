package oop.Polymorphism;

public class AmazonSearch
{
	
	public void search(String pname)
	{
		System.out.println("Product search with name: "+pname);
	}
	
//	public void search(String pname)
//	{
//		System.out.println("Product search with name: "+pname);
//	}
	public void search(int price)
	{
	System.out.println("Product search with price: "+price);	
	}
	
	public void search(String bname,String pname)
	{
		System.out.println("Product search with brand name: "+bname+" & product name: "+pname);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Product search with product name: "+pname+" & price: "+price);
	}
	
	
	public void search(int price,String pname)
	{
		System.out.println("Product search with product name: "+pname+" & price: "+price);
	}
}