package arrayDemo;

public class Array1D_Demo {

	public static void main(String[] args) 
	{
		// Array -1D new keyword 
		
//		int sid[]=new int[5];
//		//index= 0 to 4
//		sid[0]=101;
//		sid[1]=102;
//		sid[2]=103;
//		sid[3]=104;
//		sid[4]=105;
//		
		int sid[]= {101,102,103,104,105};
		System.out.println("Length of array: "+sid.length);//5
		
		System.out.println(sid[3]);//104
		
		System.out.println(sid[0]);//101
		
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
		
	System.out.println("*******Iterate array using simple for loop********");
		
	for(int i=0;i<sid.length;i++)//index
	{
		System.out.println(sid[i]);
	}	System.out.println("*******Iterate array using for-each loop********");

	for(int i:sid)
	{
		System.out.println(i);
	}
	
	
	System.out.println("************************************");
	
	
//	String studentName[]=new String[3];
//	studentName[0]="Mohit";
//	studentName[1]="Smita";
//	studentName[2]="Abhi";
	String studentName[]= {"Mohit","Smita","Abhi"};
	
	System.out.println("Total students: "+studentName.length);
	
	System.out.println("0th position: "+studentName[0]);
	
	for(int i=0;i<studentName.length;i++)
	{
		System.out.println(studentName[i]);
	}
	System.out.println("***********************************");
	for(String i:studentName)
	{
		System.out.println(i);
	}
	System.out.println("***********************************");
	
//	double marks[]=new double[3];
//	marks[0]=67.69;
//	marks[1]=45.78;
//	marks[2]=34.78;
	double marks[]= {67.69,45.78,34.78};
	
	System.out.println("length of array: "+marks.length);
	System.out.println("Totalmarks are: "+(marks[0]+marks[1]+marks[2]));
	
	for(int i=0;i<marks.length;i++)
	{
		System.out.println(marks[i]);
	}
	
	System.out.println("********************************");
	
	for(double i:marks)
	{
		System.out.println(i);
	}
	
	System.out.println("*********************************");
	
	//Literal way
	//Object is super class in java
	Object empdata[]= {"Sarang","Pune",'M',40,9866578765L,89.78};
	System.out.println("Length is: "+empdata.length);
	
	System.out.println(empdata[4]);
	
	System.out.println("**************");
	
	
	
	for(Object i:empdata)
	{
		System.out.println(i);
	}
	

	}

}