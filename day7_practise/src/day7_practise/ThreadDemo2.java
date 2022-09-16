package day7_practise;

public class ThreadDemo2 {

	public static void main(String[] args) {
		//Case 2: Difference Between start() and run()
		//1.start() creates a new thread and invoke run() method internaaly
		//2.run() it doesn't create any thread and it's like a normal calling method
//		MyThread2 myThread2=new MyThread2();
//		myThread2.start();
//		for(int i=0;i<5;i++) {
//			System.out.println("i am main thread");
//		}
//		
//		myThread2.run();
//		for(int i=0;i<5;i++) {
//			System.out.println("i am main thread");
//		}
		
//		Case3:if we are not ovreriding run method it will thread class run method which doesn't have nothing
//		MyThread3 myThread3=new MyThread3();
//		myThread3.start();
		
//		Case4:if we Overloading of run method it will call only no args run() method other want to call like a normal method
//		MyThread4 myThread4=new MyThread4();
//		myThread4.start();
//		for(int i=0;i<5;i++) {
//			System.out.println("i am main thread");
//		}
//		Case3:if we are not ovreriding start method it won't create thread class and invoke like a normal method 
		MyThread5 myThread5=new MyThread5();
		myThread5.start();
	}

}
class MyThread5 extends Thread{
	public void start() {
		for(int i=0;i<5;i++)
			System.out.println("Hello i start  new Thread");
	}
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Hello i am new Thread");
	}
}
class MyThread4 extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
			run(10);
			System.out.println("Hello i am new Thread");
	}
	public void run(int num) {
		for(int i=0;i<5;i++)
			System.out.println("Hello i am new Thread");
	}
}
class MyThread3 extends Thread{
	
}
class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Hello i am new Thread");
	}
}