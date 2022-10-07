package multi_Threading_Practises;

public class SynchronizeBlockDemo {

	public static void main(String[] args) {
		// Synchronize Via Object level Lock
//		Movie2 m=new Movie2();
//		Syncblockdemo thread1=new Syncblockdemo(m,"Sana");
//		Syncblockdemo thread2=new Syncblockdemo(m,"Vasi");
//		thread1.start();
//		thread2.start();
		// Synchronize Via Class Level Lock
		Movie3 m1=new Movie3();
		Movie3 m2=new Movie3();
		Syncblockdemo2 thread3=new Syncblockdemo2(m1,"Sana");
		Syncblockdemo2 thread4=new Syncblockdemo2(m2,"Vasi");
		thread3.start();
		thread4.start();
	}

}
class Movie2{
	public void shoot(String name) {
		;;;;;;;;;
		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			for(int i=0;i<10;i++) {
				System.out.print("Movie Name is :");
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					
				}
				System.out.println(name);
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
}
class Syncblockdemo extends Thread{
	Movie2 d;
	String name;
	public Syncblockdemo(Movie2 d,String name) {
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.shoot(name);
	}
}
class Movie3{
	public void shoot(String name) {
		;;;;;;;;;
		System.out.println(Thread.currentThread().getName());
		synchronized (Movie3.class) {
			for(int i=0;i<10;i++) {
				System.out.print("Movie Name is :");
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					
				}
				System.out.println(name);
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
}
class Syncblockdemo2 extends Thread{
	Movie3 d;
	String name;
	public Syncblockdemo2(Movie3 d,String name) {
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.shoot(name);
	}
}
