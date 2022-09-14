package day3task;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date(12,7,2001);
		if(d1.isValid(d1)) {
			d1.displayDate();
		}else {
			System.out.println("Please Type Valid Date");
		}
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
		System.out.println("It is Valid Date ");
		System.out.println(day+"-"+month+"-"+year);
	}
	public boolean isValid(Date d1) {
		if((d1.day<1 &&d1.day>31) || (d1.month<1 &&d1.month>12) || (d1.year<1500 &&d1.year>2200)) {
			return false;
		}
		else if(d1.month==2) {
			if(isLeap(d1.year)) {
				return d1.day>0&&d1.day<30?true:false;
			}
			return d1.day>0&&d1.day<29?true:false;
		}
		else if(d1.month==1 ||d1.month==3||d1.month==5||d1.month==7||d1.month==8||d1.month==10||d1.month==12)
		{
			return d1.day>0&&d1.day<32?true:false;
		}
		else if(d1.month==4 ||d1.month==6||d1.month==9||d1.month==11){
			return d1.day>0&&d1.day<31?true:false;
		}
		
		return true;
	}
	public boolean isLeap(int num) {
		return num%4==0?true:false;
	}
}

