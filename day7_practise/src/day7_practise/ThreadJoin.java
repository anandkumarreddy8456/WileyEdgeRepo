package day7_practise;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		Threadexcute threadexcute1=new Threadexcute();
		Threadexcute threadexcute2=new Threadexcute();
		Threadexcute threadexcute3=new Threadexcute();
		
		threadexcute1.start();
		threadexcute1.join();
		threadexcute2.start();
		threadexcute2.join();
		threadexcute3.start();
		threadexcute3.join();
		
	}

}
class Threadexcute extends Thread{
	public void run() {
		System.out.println("Thread Name is "+Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		System.out.println("Hello I am working "+Thread.currentThread().getId());
	}
}
