package multi_Threading_Practises;



public class JoinDemo2 {

	public static void main(String[] args) throws InterruptedException {
		Demo d=new Demo();
		d.start();
		d.join(10000);
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}

	}

}
class Demo extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Seetha Thread");
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}