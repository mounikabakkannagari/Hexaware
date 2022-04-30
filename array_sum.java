import java.util.Scanner;
class array_sum
{
	public static void main(String args[])
	{
		int[] arr=new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			int num=sc.nextInt();
			arr[i]=num;
		}
		for( int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("enter sum of array elements are: "+sum);
	}
}