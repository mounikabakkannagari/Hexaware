import java.util.*;
import java.io.*;
import java.sql.*;
class A
{
	void abc()   throws MinAgeException,FileNotFoundException,SQLException,NullPointerException 
	{
		for(int i=0;i<=20;i++)
		{
			if(i==10) throw new FileNotFoundException();
			if(i==8) throw new SQLException();
			if(i==6) throw new NullPointerException();
			if(i==15) throw new  MinAgeException ("Min ge exception ");
			System.out.println(i);
		}	
	}
}
class exceptionhandling
{
	public static void main(String args[])  
	{
		try
		{
			A a=new A();
			a.abc();
		}
		catch(MinAgeException ma)
		{
			System.out.println(ma);
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println(fnf);
		}
		catch(SQLException sq)
		{
			System.out.println(sq);
		}
		catch(NullPointerException np)
		{
			System.out.println(np);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thnak you ...!");
		}
	}
}
class MinAgeException extends Exception 
{
	MinAgeException(String str)
	{
		super(str);
	}
}
