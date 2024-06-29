package week1;

public class ConstructorDemo 
{
	//instance-current class variable
	 int id;
	 String name;
	 
	 //constructor-default
	public ConstructorDemo()//0 argument/parameter
	 {
		 System.out.println("Student id is: "+id);
		 System.out.println("Student name is: "+name);
	 }
	 
	
	//parameterized constructor(declare)
	public ConstructorDemo(int i,String n)//2 parameters i=101 n=Amit
	{//set the data to instance variable
		id=i;
		name=n;
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		
				
	}
	 
	public static void main(String[] args)
	{
		//calling -real data

		//object
		ConstructorDemo c1=new ConstructorDemo();//default constructor
		
		ConstructorDemo c2=new ConstructorDemo(101,"Amit");//parameterized
		
		
		
		

	}

}