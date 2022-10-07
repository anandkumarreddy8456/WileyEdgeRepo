package multi_Threading_Practises;

public class JoinDemo3 {

	public static void main(String[] args) throws InterruptedException {
		//Thread.currentThread().join(); -->DeadLocak Situation
		Demo3.mt=Thread.currentThread();
		Demo3 d=new Demo3();
		d.start();
		//d.join();   --->DeadLocak Situation
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
class Demo3 extends Thread{
	static Thread mt;
	public void run() {
		try {
			mt.join(2500);
		}catch(InterruptedException e) {
			
		}
		for(int i=0;i<10;i++) {
			System.out.println(" Child Thread");
		}
	}
}
