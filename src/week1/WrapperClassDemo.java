package week1;

public class WrapperClassDemo {

	public static void main(String[] args) 
	{

		/*
		 * To store primitive data in the form of object(Collection framework) 
		 * &
		 * To convert object into primitive we use wrapper class
		 * 
		 * Wrapper class & its method parseDatatype()
		 * 
		 * If data is not in convertable form you will get exception
		 * NumberFormatException
		 */
		
		String s1="100";
		System.out.println(s1+100);//100ABC100
		//string to int-->Integer wrapper class
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		
		String s2="22.39";
		System.out.println(s2+11.11);//22.3911.11
		//string to double
		double d=Double.parseDouble(s2);
		
		System.out.println(d+11.11);//double addtion 33.50
		
		String s3="True";
		boolean b=Boolean.parseBoolean(s3);
		System.out.println(b);
		
		String s4="Rohit";
		/*
		 * String is class in java
		 * String is collection of characters
		 * String class have inbuilt methods
		 * specific character from string use -charAt(index)
		 */
		//Character.p
		char c=s4.charAt(3);
		System.out.println(c);
		
		System.out.println("*******************************");
		//primitive to Object(String ---valueOf())
		
		
		int x=200;
		System.out.println(x+100);//300
		
		//int into String
		String ss1=String.valueOf(x);
		System.out.println(ss1+100);//200100
		
		
		float f=23.56f;
		System.out.println(f+11.11f);
		//float-->string
		String ss2=String.valueOf(f);
		System.out.println(ss2+11.11f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}