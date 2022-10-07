package multi_Threading_Practises;

public class SleepDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("Slides Presention no is "+i);
			Thread.sleep(500);
		}
	}

}
