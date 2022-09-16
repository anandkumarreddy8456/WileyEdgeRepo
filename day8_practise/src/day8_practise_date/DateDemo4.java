package day8_practise_date;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1=LocalDate.of(2001, 8, 15);
		LocalDate date2=LocalDate.now();
		Period period=Period.between(date1, date2);
		System.out.println("Your age is "+period.getDays()+" days "+period.getMonths()+" months "+period.getYears()+" years");
	}

}
