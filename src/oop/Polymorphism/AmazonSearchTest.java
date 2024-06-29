package oop.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args) 
	{

		AmazonSearch as=new AmazonSearch();
		as.search(20000);
		as.search("Iphone");
		as.search("Bag",3000);
		as.search("Zara","Bag");
		
	}

}