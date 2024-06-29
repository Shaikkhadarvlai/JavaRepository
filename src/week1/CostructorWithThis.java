package week1;

public class CostructorWithThis
{
	//instance
	int id;
	String name;
	
	//constructor-parameterized
	public CostructorWithThis(int id,String name)//local
	{
		//name conflict
//		id=id;
//		name=name;
		//current class variable=local variable
		this.id=id;
		this.name=name;
		
	}
	//method
	public void show()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name: "+name);
	}
	
	
	
	
//execution
	public static void main(String[] args)
	{
		CostructorWithThis c1=new CostructorWithThis(101,"Parag");
		c1.show();
	}

}