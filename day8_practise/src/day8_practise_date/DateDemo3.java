package day8_practise_date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm");
		String format=dateTimeFormatter.format(dateTime);
		System.out.println(format);
	}

}

