package oop.Encapsulation;


class Employee
{
	

	//data-hide
	private int id=101;
	private String name="Meeta";
	
	//Access -Public method for data getter and setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//business Logic
	public void show()
	{
		System.out.println("Employee id is: "+id);
		System.out.println("Employee name is: "+name);
	}
}






public class EncapsulationDemo {

	public static void main(String[] args)
	{

		Employee e1=new Employee();
		e1.show();
		System.out.println("******************");
//		e1.id=201;//The field Employee.id is not visible
//		e1.name="Arti";
		//to access private data use setter and getter
		e1.setId(301);
		e1.setName("Parag");
		System.out.println(e1.getId()+"   "+e1.getName());
		System.out.println("*****************");
		e1.show();

	}

}