package multi_Threading_Practises;

import java.util.Stack;

public class ApplicationOnInterThreadCommunication {

	public static void main(String[] args) {
		new Producer().start();
		new Consumer().start();

	}

}
class Market{
	static Stack<Integer> stack=new Stack<>();
	public  synchronized void vegitableBox() {
		if(stack.isEmpty() ) {
			addNumber();
			System.out.println("Stack added");
		}
			System.out.println("Stack is taken from "+stack);
		
		
		
	}
	private static  void addNumber() {
		for(int i=0;i<5;i++) {
			stack.add(15+i);
		}
	}
}
class Producer extends Thread{
	
	public void run() {
		synchronized (Thread.currentThread()) {
		System.out.println("I am Providing Vegitables to ");
		new Market().vegitableBox();
		System.out.println("I am providing Notification");
		//this.notify();
		}
	}
	public synchronized void insertVeg() {
		
		
	}
}
class Consumer extends Thread{
	public void run() {
		try {
			synchronized (Thread.currentThread()) {
				System.out.println(Thread.currentThread().getName());
				//this.wait();
				System.out.println("Waiting is Over");
			}
			//new Producer().wait();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		new Market().vegitableBox();
	}
	
}

