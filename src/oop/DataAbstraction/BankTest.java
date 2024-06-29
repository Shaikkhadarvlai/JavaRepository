package oop.DataAbstraction;

public class BankTest {

	public static void main(String[] args)
	{
		HDFC h1=new HDFC();
		h1.customerDetails();//individual
		h1.deposite();//inherited abstract 
		h1.withdraw();//inherited abstract 
		h1.rateOfInterest();//inherited abstract 
		
		
		System.out.println("*********************");
		//RBI r1=new RBI();//Cannot instantiate the type RBI
		
		RBI r1=new HDFC();
		r1.deposite();
		r1.withdraw();
		r1.rateOfInterest();
		
		System.out.println("*********************");

		Axies a1=new Axies();
		a1.custDetails();
		a1.deposite();
		a1.withdraw();
		a1.rateOfInterest();

	}

}