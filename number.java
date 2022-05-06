import java.util.*;
class number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the 30 numbers; ");
		int[] arr = new int[30];
		List<Integer> even =new ArrayList<Integer>();
		List<Integer> odd =new ArrayList<Integer>();
		List<Integer> positive =new ArrayList<Integer>();
		List<Integer> negative =new ArrayList<Integer>();
		List<Integer> zero= new ArrayList<Integer>();
		for(int i=0;i<30;i++)
		{
			int num=sc.nextInt();
			arr[i]=num;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even.add(arr[i]);
			}
			else if(arr[i]%2!=0)
			{
				odd.add(arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				positive.add(arr[i]);
			}
			else if(arr[i]<0)
			{
				negative.add(arr[i]);
			}
			else if(arr[i]==0)
			{
				zero.add(arr[i]);
			}
			else
			{
				System.out.println("Invalid input");
			}
		}
		System.out.println(even);
		System.out.println(odd);
		System.out.println(positive);
		System.out.println(negative);
		System.out.println(zero);
	}
}
	