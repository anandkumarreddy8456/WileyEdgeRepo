package multi_Threading_Practises;

public class SynchronizeDemo {

	public static void main(String[] args) {
		new SyncDemo().start();
		new SyncDemo().start();
		new SyncDemo().start();
		
		
		
	}

}
class SyncDemo extends Thread{
	public synchronized void run() {
		task1();
		task2();
		task3();
	}
	public static  synchronized void task1() {
		for(int i=0;i<10;i++) {
			System.out.println("First Menthod"+Thread.currentThread().getName());
		}
	}
	public static synchronized void task2() {
		for(int i=0;i<10;i++) {
			System.out.println("Second Menthod"+Thread.currentThread().getName());
		}
	}
	public static synchronized void task3() {
		for(int i=0;i<10;i++) {
			System.out.println("Third and Non Sync Menthod"+Thread.currentThread().getName());
		}
	}
}
