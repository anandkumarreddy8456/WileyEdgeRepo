package multi_Threading_Practises;

public class YieldDemo {
	
	//	yiled() Gives Oppturcunity to excute other threads which has Same priority 
	public static void main(String[] args) {
		MyThread m1=new MyThread();
		m1.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread "+Thread.currentThread().getPriority());
			Thread.yield();
		}
	}

}
class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Before Yield"+Thread.currentThread().getPriority());
			
		}
		Thread.yield();
		for(int i=0;i<10;i++) {
			System.out.println("After Yield");
			
		}
	}
}
