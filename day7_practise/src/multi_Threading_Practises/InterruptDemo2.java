package multi_Threading_Practises;

public class InterruptDemo2 {
	
	// interrpt will be ocuur on sleep or join method
	public static void main(String[] args) {
		InterDemo2 d1=new InterDemo2();
		d1.start();
		d1.interrupt();// It is not mandatory to present sleep or join in thread

	}

}
class InterDemo2 extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("I am Working");
		}
		try {
			Thread.sleep(1000);
		//	Thread.currentThread().join();
		}catch (Exception e) {
			System.out.println("I got Interrputed ");
		}
	}
}
