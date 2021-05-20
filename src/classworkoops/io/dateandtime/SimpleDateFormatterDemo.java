package classworkoops.io.dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatterDemo {

	public static void main(String[] args) throws Exception {
		
		Date mydate = new Date();
		System.out.println(mydate);
		SimpleDateFormat formatter = new SimpleDateFormat("F w W G k EEEE yyyy/MM/dd 'Time' HH:mm:ss:SSS z ");

		System.out.println(formatter.format(mydate));
		
		/* Create Data object with custom date and time */
		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		String newDateStr = "2010-01-01 23:59:01:23";
		Date newDate = formatter2.parse(newDateStr);
		System.out.println(newDate);
		System.out.println(formatter2.format(newDate));
			
	}

}
