package day7_practise;

public class ThreadDemo1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dummy dummy=new Dummy();
		Dummy dummy1=new Dummy();
		Dummy dummy2=new Dummy();
		
		dummy.start();
		dummy1.start();
		dummy2.start();
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++)
			System.out.println("Parent");
		
	}

}
class Dummy extends Thread{
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<5;i++)
			System.out.println("Child "+name);
	}
}

