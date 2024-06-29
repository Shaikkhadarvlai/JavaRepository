package exceptionHandling;

import java.io.IOException;

public class CompileTimeExeception
{
	
	

	
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.out.println("Program started!......");
		
		Thread.sleep(4000);
		
		System.out.println("Program ends!.......");
		
		System.in.read();
		
		Thread.sleep(2000);
		
	}
	
	
}