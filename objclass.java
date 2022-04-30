class objclass
{
	public static void main(String args[])
	{
		String name1="ABCD";
		String name2="ABCD";
		String name3=new String("ABCD");
		String name4=new String("ABCD");
		System.out.println(name1==name2);                //true
		System.out.println(name3==name4);                //false
		System.out.println(name1==name3);                //false
		System.out.println(name3.equals(name4));         //true
		System.out.println(name2.equals(name4));         //true
	}
}