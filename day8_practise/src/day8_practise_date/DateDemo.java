package day8_practise_date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1=new Date();
		System.out.println(d1);
		LocalDate local=LocalDate.now();
		System.out.println(local);
		
		System.out.println(LocalDate.of(2001, 02, 10));
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.parse("2002-05-15"));
		System.out.println(LocalDate.ofYearDay(2022, 256));
		System.out.println(LocalDate.MAX);
		System.out.println(LocalDate.MIN);
		System.out.println(LocalDate.ofEpochDay(1500));
		System.out.println(LocalDate.of(2001,5,15));
		
		Calendar cal=Calendar.getInstance();
		System.out.println(Calendar.APRIL);
		System.out.println(Calendar.HOUR_OF_DAY);
		System.out.println(Calendar.FIELD_COUNT);
		System.out.println(Calendar.getInstance().getFirstDayOfWeek());
		System.out.println(cal.getCalendarType());
		System.out.println(cal.getWeeksInWeekYear());
		System.out.println(cal.getTimeZone().toZoneId());
		
		Period period=Period.between(LocalDate.of(2001,8,15), LocalDate.now());
		System.out.println(period.getYears());
		
	}

}
