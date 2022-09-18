package day7_practise;

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new ThreadPrio(),"Thread1");
		Thread t2=new Thread(new ThreadPrio(),"Thread2");
		Thread t3=new Thread(new ThreadPrio(),"Thread3");
		
		t1.start();t2.start();t3.start();
		t3.setPriority(10);
	}

}
class ThreadPrio implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello My Name is "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("Hello");
			}
		}
		
	}
	
}
