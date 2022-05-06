class A  extends Thread {
	public  synchronized void run() 
	{
		try
		{
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+ i);
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
		}
	}
}
class multiex1
{
	public static void main(String args[])
	{
		A a =new A();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);

		t1.start();
		t2.start();

		t1.setName("Rama");
		t2.setName("Seetha");

	}
}