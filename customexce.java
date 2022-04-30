import java.util.Scanner;
class A
{
	A() throws MinageException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		if(age<=18)
		{
			throw new MinageException("age must be greater than 18");
		}
		else
		{
			System.out.println("eligible for voting");
		}
	}
}
class MinageException extends Exception
{
	MinageException(String str)
	{
		super(str);
	}
}
class customexce
{
	public static void main(String args[])
	{
		
		try
		{
			A a=new A();
		}
		catch(MinageException m)
		{
			System.out.println(m);
			System.out.println("exception caught");
		}
		
	}
}