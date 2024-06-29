package oop.DataAbstraction;

public class HDFC implements RBI
{
	
	public void customerDetails()
	{
		System.out.println("HDFC.....Customers details()");
	}

	@Override
	public void deposite() {

		System.out.println("HDFC.....deposite()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC......withdraw()");
		
	}

	@Override
	public void rateOfInterest() {

		System.out.println("HDFC.....rate of interest is 8%");
		
	}

}