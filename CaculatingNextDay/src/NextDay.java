
public class NextDay {
	private static int a[]={ 31,28,31,30,31,30,31,31,30,31,30,31};
	public static Date nextDayOf(Date d){
		int day=d.getDay();
		int month=d.getMonth();
		int year=d.getYear();
		
		if(day+1 <=a[d.getMonth()-1])
			day+=1;
		else if(month+1<=12)
		{
			day=1;
			month+=1;
		}
		else
		{
			day=1;
			month=1;
			year+=1;
		}
		
		Date d1 = new Date(day,month,year);
		return d1;
			
	}
}
