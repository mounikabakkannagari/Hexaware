class sort_ex
{
	public static void main(String args[])
	{
		int[] arr= new int[]{100,250,150,350,490,560,440};
		
		int num=0;
		//arr=[100,250,150,350,490,560,440];
		int temp=0;
		System.out.println("Elemnts greater than 200 are: ");
		//System.out.println("Sorted array is :");
		for (int k=0;k<arr.length;k++)
		{
			if(arr[k]>200)
			{
				System.out.print(arr[k]+", ");
			}
		}
		
	}
}