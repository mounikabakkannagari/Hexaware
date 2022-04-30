class str_strb
{
	public static void main(String args[])
	{
		String name="Mounika";
		String name1="Reddy";
		String name2="Mounika";
		String name3="mounika";
		String name4="   mounika";
		String s=new String(" Bakkannagari");
		s.concat(name);
		StringBuffer sb=new StringBuffer("Bakkan");
		sb.append(name);
		System.out.println(sb);
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name3));
		System.out.println(name.equalsIgnoreCase(name3));
		System.out.println(name.replace("n","l"));
		System.out.println(name.length());
		System.out.println(name4.length());
		System.out.println(name4.trim());
		System.out.println(name4.trim().length());
		System.out.println(name.charAt(4));
		System.out.println(name.isEmpty());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		sb.replace(1,5,"mouni");
		System.out.println(sb);
		sb.delete(2,4);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
				