class obj
{
	int id;
	String name;
	String place;
	obj( int id,String name,String place)
	{
		this.id=id;
		this.name=name;
		this.place=place;
	}
	public String toString()
	{
		return id+" "+name+" "+place;
	}
	public static void main(String args[])
	{
		obj e1=new obj(100,"Mounika","HYD");
		obj e2=new obj(200,"MAnohari","Chennai");
		System.out.println(e1);
		System.out.println(e2);
	}
}