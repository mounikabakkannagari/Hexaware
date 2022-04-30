import java.util.*;
class ele_ex
{
	public static void main(String args[])
	{
		int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] a=new int[]{2,3,5,6,7,2};
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==arr[i])
				{
					
					list.add(arr[i]);
				}
			
				
			}
		}
		System.out.println("Repeating elements are: "+list);
		
		
	}
}