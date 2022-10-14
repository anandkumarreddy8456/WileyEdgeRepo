package multi_Threading_Practises;

//import java.util.Scanner;

public class WaitandNotifyDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WaitDemo thread1=new WaitDemo(); 
		thread1.start();
		// Thread.sleep(1000); --> it is Deadlock Sitution
		synchronized (thread1) {
			System.out.println("Main Thread Starts");
			thread1.wait();
		// With This Way 
			System.out.println("Main Thread got notification ");
			System.out.println(thread1.total);
		}
		
	}
	//new Waste().dosome(new Scanner(System.in).nextLine());
}
class WaitDemo extends Thread{
	int total=0;
	public void run() {
		synchronized (Thread.currentThread()) {
			
		
		System.out.println("Child Starts Excu");
		for(int i=0;i<=100;i++) {
			total=total+i;
		}
		//Thread.currentThread().notify();
		this.notify();
		}
	}
}
class Waste{
	public void dosome(String name) {
		String res="";
		for(int i=0;i<name.length();i++) {
			res=res+charct(name.charAt(i)+"");
		}
		System.out.println(res);
	}
	public String charct(String val) {
		if(val.charAt(0)=='A') {
			return "*";
		}
		if(val.charAt(0)=='z') {
			return "@";
		}

		if(val.charAt(0)>'A' && val.charAt(0)<='Z') {
			char temp=(char) (val.charAt(0)-1);
			val=(temp+"").toLowerCase();
			return val;
		}
		else if(val.charAt(0)>='a' && val.charAt(0)<'z') {
			char temp=(char) (val.charAt(0)+1);
			val=(temp+"").toUpperCase();
			return val;
		}
		else if(val.charAt(0)>48 && val.charAt(0)<58){
			int temp=Integer.parseInt(val);
			val=temp>0?(temp-1)+"":"1";
			return val;
		}
		if(val.charAt(0)==' ') {
			return "^";
		}
		else {
			return "~";
		}
	}
}