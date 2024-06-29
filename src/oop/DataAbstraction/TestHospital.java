package oop.DataAbstraction;

public class TestHospital {

	public static void main(String[] args) 
	{
		//child class ref and child class object
		NobelHs h1=new NobelHs();
		h1.cardio();//inherited abstract
		h1.dental();
		h1.medicalService();//individual
		h1.nero();
		h1.physio();
		h1.covid19Test();
		
		
		System.out.println("**********************");
		
		//parent class ref and child Object
		IMA i1=new NobelHs();
		i1.dental();
		i1.cardio();
		i1.covid19Test();
		
		System.out.println("**********************");
		USMA u1=new NobelHs();
		u1.nero();
		u1.physio();
		u1.covid19Test();
		
		

	}

}