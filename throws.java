import java.util.io;
class throws
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
		File f=new File("abc.txt");
		FileReader fr = new FileReader(f);
	}
}