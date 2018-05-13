package co.edureka.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int mm = cal.get(Calendar.MONTH); // 0 - 11
		int yy = cal.get(Calendar.YEAR);
		
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		
		System.out.println(dd+"/"+(mm+1)+"/"+yy);
		System.out.println(hh+" : "+mi);
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String dt = sdf.format(date);
		System.out.println(dt);

	}

}
