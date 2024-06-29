package arrayDemo;

public class Array2D_Demo {

	public static void main(String[] args) 
	{

		//using new keyword
		int arr[][]=new int[2][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		System.out.println("Total rows are: "+arr.length);//2
		System.out.println("Total columns are: "+arr[0].length);//3
		//single data
		System.out.println(arr[0][1]);//20
		System.out.println(arr[1][2]);//60
		//System.out.println(arr[1][3]);//ArrayIndexOutOfBoundsException
		
		System.out.println("*********Iteration using for loop**********");
		
		for(int i=0;i<arr.length;i++)//rows
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("******************for each loop*******************");
		
		
		for(int i[]:arr)//[10,20,30] row
		{
			for(int j:i)//j=10
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("**************************");
		
		//literal way
		int sid[][]= {{10,20},{30,40},{50,60}};
		
		System.out.println("Total rows are: "+sid.length);//3
		System.out.println("Total coulmns are: "+sid[0].length);//2
		
		
		System.out.println(sid[1][0]);//30
		System.out.println("*************");
		for(int i[]:sid)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("**************************");
		
		String loc[][]= {{"pune","vimanNagar"},{"Nagpur","location"},{"Mumbai","Virar"}};
		
		for(String i[]:loc)
		{
			for(String j:i)
			{
				System.out.print(j+"\t");
			}
			
			System.out.println();
			
		}
			
	}

}