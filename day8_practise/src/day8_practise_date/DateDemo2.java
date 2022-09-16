package day8_practise_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------");
		
		Date date=new Date();
		System.out.println(date);
		System.out.println("--------------------");
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println("--------------------");
		
		LocalDate local=LocalDate.now();
		System.out.println(local);
		
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date2=LocalDate.parse("15-Mar-2022",dateTimeFormatter);
		System.out.println(date2);
		
	}

}
