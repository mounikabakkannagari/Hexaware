import java.util.Scanner;
import java.io.*;
class throws_ex
{
	public static void main(String args[]) throws FileNotFoundException
	{
		m1();
	}
	public static void m1() throws FileNotFoundException
	{
		m2();
	}
	public static void m2() throws FileNotFoundException
	{
		System.out.println("Hii");
		
		File f=new File("abc.txt");
		FileReader fr = new FileReader(f);

	}
}