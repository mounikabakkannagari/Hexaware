import java.util.Scanner;
class strlen
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  string: ");
		String name=sc.next();
		int count=0;
		for(char c: name.toCharArray())
		{
			count=count+1;
		}System.out.println("Length of the String is: "+count);

	}
}