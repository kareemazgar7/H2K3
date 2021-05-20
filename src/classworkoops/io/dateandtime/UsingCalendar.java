package classworkoops.io.dateandtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsingCalendar {

	public static void main(String[] args) {
		
		//Calendar mycal = new GregorianCalendar();
		GregorianCalendar mycal = new GregorianCalendar();
		System.out.println(mycal);
		Date mydate = mycal.getTime();
		System.out.println(mydate);
		System.out.println("first day of the week: " + mycal.getFirstDayOfWeek());
		System.out.println("weeks in week year: " + mycal.getWeeksInWeekYear());
		System.out.println("get week year: " + mycal.getWeekYear());
		System.out.println("Day of month: " +mycal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Year: " + mycal.get(Calendar.YEAR));
		System.out.println("Month: " + mycal.get(Calendar.MONTH));
		System.out.println("Day of the week: " + mycal.get(Calendar.DAY_OF_WEEK));
		System.out.println("Minute: " + mycal.get(Calendar.MINUTE));
		System.out.println("Leap year: " + mycal.isLeapYear(Calendar.YEAR));
		mycal.add(Calendar.YEAR, 1);
		mycal.add(Calendar.MONTH, 2);
		mycal.add(Calendar.DAY_OF_MONTH, 10);
		Date fdate = mycal.getTime();
		System.out.println(fdate);
		mycal.add(Calendar.YEAR, -2);
		mycal.add(Calendar.MONTH, -2);
		mycal.add(Calendar.DAY_OF_MONTH, -5);
		Date pdate=mycal.getTime();
		System.out.println(pdate);
		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		System.out.println(formatter2.format(pdate));
	}

}

