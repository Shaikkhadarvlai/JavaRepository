package controlFlowStatement;


import java.util.Scanner;

public class NestedIf_BrowserDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		/*
		 * String is class in java so to perform operation on string 
		 * we don't use operator
		 * In string class we have ready made methods
		 * 
		 * For testing equality between two strings
		 * ===========================================
		 * 1.equals(): exact match the string but it is case sensitive
		 * 
		 * 2.equalsIgnoreCase(): exact match the string it is not case sensitive
		 * 
		 */
		
		
//		String act="Hello All";
//		String exp="Hello all";
//		System.out.println(act.equals(exp));//false
//		
//		System.out.println(act.equalsIgnoreCase(exp));//true
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test is executing on chrome!");
		}else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test is executing on firefox");
			
		}else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test is executing on edge");
		}else
		{
			System.out.println("Write valid name for browser!");
		}
		
		

	}

}