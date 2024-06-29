package week1;

public class ThisKeywordDemo 
{
	public void m1()
	{
		System.out.println("M1() is calling......");
		//this.m2();//method using this keyword
	}
	
	
	public void m2()
	{
		System.out.println("M2() is calling......");
		this.m1();
	}
	

	public static void main(String[] args)
	{
		ThisKeywordDemo  t1=new ThisKeywordDemo ();
		t1.m1();
		
		t1.m2();
		
		

	}

}