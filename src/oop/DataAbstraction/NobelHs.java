package oop.DataAbstraction;

//Multiple inheritance in java-interface
public class NobelHs implements IMA,USMA
{
	public void medicalService()
	{
		System.out.println("NobleHs......MedicalService");
	}

	@Override
	public void cardio() {

		System.out.println("NobelHs....CardioService");
		
	}

	@Override
	public void dental() {
		System.out.println("NobelHs....dentalService");
		
	}

	@Override
	public void nero() {
		System.out.println("NobelHs....neroService");

		
	}

	@Override
	public void physio() {
		System.out.println("NobelHs....physioService");

		
	}

	@Override
	public void covid19Test()
	{
		System.out.println("NobelHs....covid19Test()");

	}

}