package classworkoops.io.dateandtime;

import java.util.Date;

public class UsingDate {

	public static void main(String[] args) {
		
		Date date1 = new Date();
		System.out.println(date1);
		Date date2 = new Date();
		System.out.println(date2);
		
		System.out.println(" after : " + date1.after(date2));
		System.out.println(" after : " + date2.after(date1));
		
		System.out.println(" before : " + date1.before(date2));
		System.out.println(" before : " + date2.before(date1));
		
		System.out.println(" equals : " + date2.equals(date1));
		System.out.println(" equals : " + date2.equals(date2));
		
		System.out.println(" compareTo : " + date1.compareTo(date1)); //equals  0
		System.out.println(" compareTo : " + date1.compareTo(date2)); //before  -1
		System.out.println(" compareTo : " + date2.compareTo(date1)); //after 1
		
		
	}

}
