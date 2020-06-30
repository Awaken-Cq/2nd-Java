package thisisjava.javautil;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {

	
	public static void main(String[] args) {
		//시간
		Date now = new Date();
		
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println(sdf.format(now));
		
		//달력
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String weekStr = "";
		int amPm = cal.get(Calendar.AM_PM);
		String amPmStr = "";
		
		if ( Calendar.AM == amPm ) {
			amPmStr = "오전";
		} else {
			amPmStr = "오후";
		}
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		switch(week) {
		
			case Calendar.MONDAY :
				weekStr = "월";	
				break;
			case Calendar.TUESDAY :
				weekStr = "화";	
				break;
			case Calendar.WEDNESDAY :
				weekStr = "수";	
				break;
			case Calendar.THURSDAY :
				weekStr = "목";	
				break;
			case Calendar.FRIDAY :
				weekStr = "금";	
				break;
			case Calendar.SATURDAY :
				weekStr = "토";	
				break;
			case Calendar.SUNDAY :
				weekStr = "일";	
				break;
		}
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(weekStr + "요일");
		System.out.println(amPmStr);
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
	
		Instant instant1 = Instant.now();
		
		System.out.println(instant1);	// 세계협정시 UTC 기준
		
		LocalDate ld = LocalDate.now();
		
		System.out.println(ld.getMonth());
		
		
		
		
	}
		
}