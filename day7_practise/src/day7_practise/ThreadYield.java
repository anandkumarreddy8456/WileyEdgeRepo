package day7_practise;

public class ThreadYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadone t1=new Threadone();
		Threadtwo t2=new Threadtwo();
		t1.start();
		t2.start();
		t1.setPriority(6);
	}

}
class Threadone extends Thread{
	public void run() {
		Thread.yield();
		for(int i=0;i<5;i++)
			System.out.println("Hello i am ThreadOne");
	}
}
class Threadtwo extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("Hello i am ThreadTwo");
	}
}
