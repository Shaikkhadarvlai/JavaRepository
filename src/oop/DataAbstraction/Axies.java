package oop.DataAbstraction;

public class Axies implements RBI
{
	
	public void custDetails()
	{
		System.out.println("Axies .....customerDetails()");
	}

	@Override
	public void deposite() {

System.out.println("Axies......deposite");
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Axies......withdraw");
	}

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("Axies.....rate of interest is 9%");
	}

}