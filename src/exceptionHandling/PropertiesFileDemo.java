package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) throws IOException
	{

		//get the path
		File f1=new File(System.getProperty("user.dir")+"\\Test.properties");
		FileInputStream fs=new FileInputStream(f1);
		
		//to read
		Properties p1=new Properties();
		p1.load(fs);
		
		System.out.println("Browser name is: "+p1.getProperty("bname"));
		System.out.println("Browser version is: "+p1.getProperty("bversion"));
		
	}

}