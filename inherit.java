package p1;
public class a
{
	public int a;
	protected int b;
	private int c;
		   int d;
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class b extends a
{
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);           // cannot print because it is private
		System.out.println(d);
	}
}
class inherit 
{
	public static void main(String args[])
	{
		a r=new a();
		System.out.println(r.a);
		System.out.println(r.b);
		//System.out.println(r.c);            //cannot print  as it is private
		System.out.println(r.d);
	}
}