package day7_practise;

public class ThreadDemo {
	
	//MultiTasking is divided into two groups
	//1.Process Based Multitasking
	//2. Thread based multi threading
	public static void main(String[] args) {
		//We can define thread in two ways
		// 1.extends Thread Class
		// 2.implements Runnable interface
		
		MyThread myThread=new MyThread();
		myThread.start();
		for(int i=0;i<5;i++)
			System.out.println("Hello I am Already Here");
	}

}
class MyThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Hello i am new Thread");
	}
}
