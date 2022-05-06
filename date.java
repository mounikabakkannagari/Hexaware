import java.util.Date;
import java.time.LocalDate;
class date
{
	public static void main(String args[])
	{
		Date d=new Date();
		System.out.println("Date is : "+d.getDate());
		System.out.println("Day is : "+d.getDay());
		System.out.println("Month is : "+d.getMonth());
		System.out.println("Hour  is : "+d.getHours());
		System.out.println("minute is : "+d.getMinutes());
		System.out.println("Second is : "+d.getSeconds());
		LocalDate l= LocalDate.now();
		System.out.println("Local date  is : "+l);
		LocalDate m= l.minusDays(2);
		System.out.println("Local date  is : "+m);
		LocalDate n= l.plusDays(1);
		System.out.println("Local date  is : "+n);
	}
}