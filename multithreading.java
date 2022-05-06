
class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);			}
		}
		catch(Exception e)
		{
			//System.out.println(e);
		}
	}
}
	
class B extends Thread
{
	public void run()
	{
		try
		{
			for(int j=0;j<=5;j++)
			{
				System.out.println("                     "+j);
				Thread.sleep(1000);			}
		}
		catch(Exception e)
		{
			//System.out.println(e);
		}
	}
}
class multithreading
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		a.start();
		b.start();
	}
}