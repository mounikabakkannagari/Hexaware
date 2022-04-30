import java.io.*;
class throws_ex
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
		System.out.println("Hii");
		try
		{
			File f=new File("abc.txt");
			FileReader fr = new FileReader(f);
		}
		catch(FileNotFoundException fn)
		{
			System.out.println("File not found");
		}
	}
}