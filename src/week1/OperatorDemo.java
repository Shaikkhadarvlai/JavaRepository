package week1;

public class OperatorDemo {

	public static void main(String[] args) 
	{
		// Arithmetic operators +,-,/,*,%
		
		int a=20,b=10;
		System.out.println("Addition is: "+a+b);//2010
		System.out.println("Addition is: "+(a+b));//30
		System.out.println("Subtraction is: "+(a-b));//10
		System.out.println("Division is: "+(a/b));//2
		System.out.println("Multiplication is: "+(a*b));//200
		System.out.println("Modulus is: "+(a%b));//0

		/*
		 * Increment and decrement
		 * ++             --
		 * 
		 * post increment(value will update in next iteration)
		 * a++---> a=a+1
		 *
		 *Pre increment
		 *++a----->a=a+1
		 */
		
		//post increment
		System.out.println("a="+a);//20
		System.out.println(a++);//20
		System.out.println(a);//21
		
		
		//pre increment
		System.out.println(b);//10
		System.out.println(++b);//11
		
		
		int c=90;
		int d=c++;
		
		System.out.println(d);//90
		System.out.println(c);//91
		
		
		
		int e=156;
		int f=e++;
		
		System.out.println(f);//156
		System.out.println(e);//157
		
		int x=46;
		int y=++x;
		System.out.println(y);//47
		System.out.println(x);//47
		
		
		int p=869;
		int q=++p;
		System.out.println(q);//870
		System.out.println(p);//870
		
		//Decrement
		
		int c1=90;
		System.out.println(c1);//90
		System.out.println(c1--);//90
		System.out.println(c1);//89
		
		
		int d1=57;
		System.out.println(d1);//57
		System.out.println(--d1);//56
		
		int a1=78;
		int b1=a1--;
		System.out.println(b1);//78
		System.out.println(a1);//77
		
		
		int r=138;
		int s=r--;
		System.out.println(s);//138
		System.out.println(r);//137
		
		int i=49;
		int j=--i;
		System.out.println(j);//48
		System.out.println(i);//48
		
		int u=199;
		int v=--u;
		System.out.println(u);//198
		System.out.println(v);//198
		
		
		System.out.println("*****Relational operators********");
		//v & u=198,p & q=870, i=48, r=137 s=138
		
		System.out.println("Less than <: "+(i<s));//true
		System.out.println(s<r);//false
		System.out.println("greater than> : "+(q>v));//true
		System.out.println("greater than and equal to: >=: "+(p>=q));//true
		System.out.println("less than equal to: <=: "+(p<=s));//false
		System.out.println(v<=u);//true
		System.out.println("equal to /comparison operator ==: "+(s==r));//false
		
		System.out.println(u==v);//true
		System.out.println("Not equal to != : "+(p!=s));//true
		System.out.println(u!=v);//false
		
		System.out.println("*********Logical operators**************");
		/*
		 * c1    c2         c1 && c2(And)   (Or)c1 || c2     !c2(Not)
		 * T      T				T 				T				F
		 * T      F 			F				T				T
		 * F	  T				F				T				F
		 * F	  F   			F 				F				T
		 * 
		 *  
		 */
		
		
		System.out.println((u==v) && (p==q));//true
		System.out.println((p<=s) && (u==v));//false
		System.out.println(p==q && p<=s);//false
		System.out.println(u!=v && p<r);//false
		
	//or operator
		
		System.out.println((u==v) || (p==q));//true
		System.out.println((p<=s) || (u==v));//true
		System.out.println(p==q || p<=s);//true
		System.out.println(u!=v || p<r);//false
		
		System.out.println("****Not operator******");
		//Not !-->to convert from true to false and vice versa
		System.out.println((p==q));//true
		System.out.println(!(p==q));//false
		
		int t=90;
		
		System.out.println(t>90);//false
		System.out.println(!(t>90));//true 
		
		System.out.println(true);//true
		System.out.println(!(true));//false
		
		
		System.out.println("***************Compound operator*********");
		int l=90;
		System.out.println(l);//90
		l+=10;//l=l+10
		System.out.println(l);//100
		l-=20;//l=l-20
		System.out.println(l);//80
		l*=2;//l=l*2;
		System.out.println(l);//160
		l/=2;//l=l/2
		System.out.println(l);//80
		l%=2;//l=l%2;
		System.out.println(l);//0
		
		
	}

}