class array
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
		System.out.println("Largest element is:"+ arr[arr.length-2]);
		System.out.println("Smallest element is: "+arr[0]);
		System.out.println("Second largest number is: "+arr[arr.length-3]);
	}
}

