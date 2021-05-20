package classworkoops.io.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class UsingDateAndTime {

	public static void main(String[] args) {

		/* Creating Date and Time Objects */
		LocalDate onlyDate = LocalDate.now();
		System.out.println("local date : " + onlyDate);
		LocalTime onlyTime = LocalTime.now();
		System.out.println("local time : " + onlyTime);
		LocalDateTime dtime = LocalDateTime.now();
		System.out.println("local date and time : " + dtime);
		ZonedDateTime ztime = ZonedDateTime.now();
		System.out.println("Zoned date and time : " + ztime);
		/*Setting format and display using format */
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MMMM-dd-yyyy hh:mm:ss a");
		System.out.println(formatter.format(dtime));
		/* Setting custom date*/
		LocalDate myDate = LocalDate.parse("2022-01-01");
		System.out.println(myDate);
		LocalDateTime myldt = LocalDateTime.parse("2023-12-13T23:58:07.855");
		System.out.println(myldt);
		LocalDateTime fldt= LocalDateTime.parse("01/14/2010 12:35 AM", DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a"));
		System.out.println(fldt);
		/* Using Period */
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.parse("2023-12-15");
		Period p = Period.between(date1, date2);
		System.out.println("years : "+ p.getYears());
		System.out.println("months : "+ p.getMonths());
		System.out.println("days : "+ p.getDays());
		/* Add or reduce years/months/weeks/days*/
		LocalDate addedDate = date1.plusYears(2).plusMonths(5).plusWeeks(1).plusDays(2);
		System.out.println(addedDate);
		LocalDate redDate = date1.minusYears(1).minusMonths(9).minusWeeks(2).minusDays(5);
		System.out.println(redDate);
		LocalDate bDate = date1.plusYears(2).minusYears(1).plusMonths(5).minusMonths(4).plusDays(6).minusDays(5).plusDays(10).plusYears(1);
		System.out.println(bDate);
		/* Add or reduce years/months/weeks/days and time*/
		LocalDateTime ndt = dtime.plusHours(3).minusMinutes(30).plusSeconds(30).plusYears(1);
		System.out.println(ndt);
	}

}
