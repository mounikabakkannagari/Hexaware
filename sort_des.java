class sort_des
{
	public static void main(String args[])
	{
		int[] arr= new int[]{100,250,150,350,490,560,440};
		//arr=[100,250,150,350,490,560,440];
		int temp=0;
		for (int i=arr.length-1; i>=0 ;i--)
		{
			for(int j=arr.length-1;j>=0;j--)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array is :");
		for (int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+", ");
		}
	}
}