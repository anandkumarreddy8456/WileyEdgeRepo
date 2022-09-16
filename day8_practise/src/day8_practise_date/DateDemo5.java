package day8_practise_date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class DateDemo5 {
	
	public static void main(String[]args) {
		
		LocalTime start=LocalTime.of(10, 05, 06);
		LocalTime end=LocalTime.of(12, 15, 06);
		
		Duration duration=Duration.between(start, end);
		System.out.println(duration.toHours()+" "+duration.toMinutes());
		
		long durate=Duration.between(start,end).toMillis();
		System.out.println(durate);
		
		Instant instant=Instant.now();
		System.out.println(instant);
		
	}
}
