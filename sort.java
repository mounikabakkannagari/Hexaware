class sort
{
	public static void main(String args[])
	{
		int[] arr= new int[]{100,250,150,350,490,560,440};
		//arr=[100,250,150,350,490,560,440];
		int temp=0;
		for (int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
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
			System.out.print(arr[k]+"");
		}
	}
}