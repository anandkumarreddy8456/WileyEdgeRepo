package multi_Threading_Practises;

public class InterruptDemo {
	//Interrupt will interrpt the wait or sleep excution Thread
	public static void main(String[] args) {
		InterDemo d1=new InterDemo();
		d1.start();
		d1.interrupt();
		System.out.println("Main Thread");

	}

}
class InterDemo extends Thread{
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				
					System.out.println("I am Sleeping");
					Thread.sleep(500);
				} 
			}
	catch (InterruptedException e) {
		System.out.println("Child Got Interrputed");
	}
	}
}
