package day3task;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Date{
	int day;
	int month;
	int year;
	public Date(){
		
	}
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void displayDate() {
		System.out.println(day+"-"+month+"-"+year);
	}
	
}
