import java.util.Scanner;
class inh
{
	public static void main(String args[])
	{
		int a;
		int b;
		int res;
		String name="10p0";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value: ");
		a=sc.nextInt();
		System.out.print("Enter b value: ");
		b=sc.nextInt();
		//res=a/b;                                   //ArithmeticException
		//System.out.println(res);
		int data = Integer.parseInt(name);
		System.out.println(data);
		//String myname=null;
		//System.out.println(myname.length());         //NullPointerException
		int arr[]=new int[3];
		arr[0]=5;
		arr[1]=14;
		arr[2]=65;
		//arr[3]=50;                                      //ArrayIndexOutOfBoundsException
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}