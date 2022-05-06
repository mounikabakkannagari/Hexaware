class count_char
{
	public static void main(String args[])
	{
		String  c="welcome to java Programming ";
        	int count=0;
        	for(int i=0;i<c.length();i++)
        	{
            if(c.charAt(i)=='a')
            {
                count++;
            }

        	}
        	System.out.println("Total number of A : "+count);
		System.out.println("===================Split =================================");

		String  c1="welcome to java Programming ";
		String[] data=c1.split("\\s");
 
		for(String mydata :data)
		{

    			System.out.println(mydata);
		}

        System.out.println("==============================");

	}
}