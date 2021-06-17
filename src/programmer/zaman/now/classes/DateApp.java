package programmer.zaman.now.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2000);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DAY_OF_MONTH, 3);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.add(0, 0);
		calendar.set(0, 0);
		
		Date tanggal = calendar.getTime(); //Mon Jan 03 00:00:00 ICT 2000
		
		System.out.println(tanggal);
	}
	
}
