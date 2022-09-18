package day7_practise;

public class Thread2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 d=new Thread2();
		Thread value=new Thread(d);
		value.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	

}
