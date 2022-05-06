class A  extends Thread {
	public void run() 
	{
		try
		{
		for(int i=0;i<=30;i++)
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
class multi
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

		try
		{
		for(int k=0;k<=50;k++)
		{
			System.out.println("		K  :"+ k);
			if(k==10)
				t1.suspend();
			if(k==20)
				t1.resume();
			if(k==15)
				t2.suspend();
			if(k==25)
				t2.resume();

			if(k==28)
				System.out.println(t1.isAlive());
			if(k==30)
				t1.stop();
			if(k==35)
				System.out.println(t1.isAlive());
			


			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
		}

		
	}
}