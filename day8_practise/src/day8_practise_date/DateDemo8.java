package day8_practise_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;



public class DateDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int year=sc.nextInt();
		
		
		Date date=new Date(dd,mm,year);
		try {
			LocalDate dateq=LocalDate.of(date.getYyyy(), date.getMm(), date.getDd());
			DateTimeFormatter datFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String format=datFormatter.format(dateq);
			System.out.println(format);
			chechrange(date);
		}
		catch(Exception e) {
			System.out.println("Invalid Date");
		}
		sc.close();
		
	}
	public static void chechrange(Date d1) {
		LocalDate date1=LocalDate.of(d1.getYyyy(), d1.getMm(), d1.getDd());
		if(date1.isAfter(LocalDate.of(2020, 1, 1))&& date1.isBefore(LocalDate.of(2022, 12, 31))){
			System.out.println("Date is Valid  and Within the Range");
		}
		else {
			System.out.println("Date is Valid  and out of Range");
		}
		
	}

}
class Date{
	int dd;
	int mm;
	int yyyy;
	public Date(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	
}