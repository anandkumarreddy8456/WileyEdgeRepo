package day7_practise;

public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread() {
			public void run() {
				System.out.println("Hello i am using Thread");
			}
		};
		new Thread() {
			public void run() {
				System.out.println("Hello i am runnable");
			}
		}.start();
		t1.start();
		
	}

}
