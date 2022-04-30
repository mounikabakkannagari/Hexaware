import p1.*;
package p2;
class D extends A
{	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class E
{
	A a= new A();
	System.out.println(a.a);
	System.out.println(a.b);
	System.out.println(a.c);
	System.out.println(a.d);
	
}