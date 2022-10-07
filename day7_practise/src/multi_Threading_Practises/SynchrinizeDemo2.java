package multi_Threading_Practises;

public class SynchrinizeDemo2 {

	public static void main(String[] args) {
		
		//Object Level Locking
		Display d1=new Display();
//		SyncDemo2 thread1=new SyncDemo2(d1, "Dhoni");
//		SyncDemo2 thread2=new SyncDemo2(d1, "Rohit");
//		SyncDemo2 thread3=new SyncDemo2(d1, "Kohili");
//		SyncDemo2 thread4=new SyncDemo2(d1, "Surya");
//		thread1.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
//		//Class Level Locking
//		Movie m1=new Movie();
//		Movie m2=new Movie();
//		SyncDemo3 thread5=new SyncDemo3(m1,"Anand");
//		SyncDemo3 thread6=new SyncDemo3(m2,"Kumar");
//		thread5.start();
//		thread6.start();
		
		//
		SyncDemo2 thread7=new SyncDemo2(d1, "Surya");
		thread7.start();
		SyncDemo2 thread8=new SyncDemo2(d1, "Ishan");
		thread8.start();
		
	}

}
class Display{
	public synchronized void show(String name) {
		for(int i=0;i<10;i++) {
			System.out.print("Good Morning :");
			try {
				Thread.sleep(200);
			}catch (Exception e) {
				
			}
			System.out.println(name);
		}
	}
	public synchronized void show() {
		for(int i=0;i<10;i++) {
			System.out.print("Good Morning :");
			try {
				Thread.sleep(200);
			}catch (Exception e) {
				
			}
			System.out.println("Anand");
		}
	}
//	public void make() {
//		for(int i=0;i<5;i++) {
//			System.out.println("   I am Thread1              ");
//		}
//	}
}

class SyncDemo2 extends Thread{
	Display d;
	String name;
	public SyncDemo2(Display d,String name) {
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.show(name);
		d.show();
	}
}
class Movie{
	public static synchronized void watch(String name) {
		for(int i=0;i<10;i++) {
			System.out.print("Making Movie : ");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			System.out.println(name);
		}
	}
}
class SyncDemo3 extends Thread{
	Movie m;
	String name;
	public SyncDemo3(Movie m,String name) {
		// TODO Auto-generated constructor stub
		this.m=m;
		this.name=name;
	}
	public void run() {
		Movie.watch(name);
	}
}
