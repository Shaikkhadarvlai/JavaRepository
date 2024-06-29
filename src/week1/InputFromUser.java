package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) throws IOException
	{
		
		
		//scanner class 
		System.out.println("Enter you age:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		System.out.println(age);
		
		
		
		
		
		
		
		
		
		/*
		
		//technique 2: BfferedReader class
		System.out.println("Enter your age: ");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String data=br.readLine();
		int age=Integer.parseInt(data);
		
		System.out.println(age);
		
		*/
		
		
		
		
		
		
		
		
	
		/*
		// technique1: read() reads single character and return int data(ASCII)
		System.out.println("Enter your age:");//22
		int age=System.in.read();//'2' as char
		System.out.println((char)age);//ascii of 2 =50-->2
		 */
	}

}