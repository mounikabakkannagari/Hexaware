import java.util.Scanner;
class datatype
{
	public static void main(String args[])
	{
		int[] arr= new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array values: ");
		for (int i=0;i<5;i++)
		{
			int num=sc.nextInt();
			arr[i]=num;
			
		}
		for(int j=0;j<5;j++)
		{
			sum=sum+arr[j];
		}
		System.out.println("Sum of all elements in array: "+sum);
	}
}