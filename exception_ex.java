import java.util.*;
import java.io.*;
class exception_ex
{
	public static void main(String args[])
	{
		
		m1();
	}
	public static void m1()
	{
		m2();
	}
	public static void m2() 
	{
		String name=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a= sc.nextInt();
		System.out.println("Enter b:");
		int b= sc.nextInt();
		
		System.out.println("Hii");
		try
		{
			int res=a/b;		
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("can't divide by zero");
		}
		try
		{
			System.out.println(name.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}