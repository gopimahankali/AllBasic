package Assignments_OrangeHrm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class System_Date {
	public static void main(String[] args) {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		String date = sdf.format(d);
		System.out.println(date);
		
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, -30);//30 days before date
		String date1 = sdf.format(cal.getTime());
		System.out.println(date1);
		
		
	}

}
