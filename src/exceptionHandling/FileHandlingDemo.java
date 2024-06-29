package exceptionHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException 
	{
		// To create a file
		File f1=new File(System.getProperty("user.dir")+"\\MyFile.txt");
		//f1.createNewFile();
		System.out.println("New File is created!");
		System.out.println("*************************");
		
		//to write data in file
		FileWriter wr=new FileWriter("MyFile.txt");
		
		wr.write("Hello All! Welcome to Java Last topic");
		wr.write("\nLest start selenium training!");
		wr.close();
		System.out.println("******File Writing is completed!****");
		
		
		//to read a file
		
		System.out.println("Read file contents:");
		
		Scanner sc=new Scanner(f1);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		
		sc.close();
		
		//to delete a file
		f1.delete();
		System.out.println("File is deleted!");
		
	}

}