package controlFlowStatement;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args)
	{
/*
 * String class provides conversion methods
 * toUpperCase()====>upper case
 * toLowerCase()====>lower case
 */
		
		
//		String s1="HeLlo";
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		switch (bname.toLowerCase()) 
		{
		case "chrome":
			System.out.println("Test case is executing on Chrome");
			break;
		case "firefox":
			System.out.println("Test case is executing on Firefox");
			break;
		case "edge":
			System.out.println("Test case is executing on Edge");
			break;

		default:
			System.out.println("Please provide appropriate browser name");
		}

	}

}