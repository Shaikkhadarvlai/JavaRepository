package week1;

public class StudentData
{
	//data
	int id;
	String name;
	
	//function
	public void show()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	

	public static void main(String[] args)
	{
		//Entry point
		/*
		 * To access class members(data + method ) 
		 * we need to create Object then with object name and . operator you can access details of class
		 * 
		 */
	
		StudentData s1=new StudentData();
		//intialize data
		s1.id=101;
		s1.name="Seema";
		s1.show();
		
		System.out.println("*********************");
		
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Amit";
		s2.show();
		
		System.out.println("*********************");
		StudentData s3=new StudentData();
		s3.id=103;
		s3.name="Ritika";
		s3.show();
		

		
		
		
		
		
	}

}