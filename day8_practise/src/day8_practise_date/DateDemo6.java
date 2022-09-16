package day8_practise_date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		DayOfWeek day=date.getDayOfWeek();
		System.out.println("Day of week :"+day);
		System.out.println("Day of Week value: "+day.getValue());
		
		System.out.println(day.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
		System.out.println(day.getDisplayName(TextStyle.SHORT, Locale.FRANCE));
	}

}
