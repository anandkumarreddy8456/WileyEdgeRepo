package day7_practise;

public class DefaultThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("Anand");
		Thread.currentThread().setPriority(10);
		System.out.println("Default Thread is "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		System.out.println("Default Thread Id is "+Thread.currentThread().getId());
		
	}

}
