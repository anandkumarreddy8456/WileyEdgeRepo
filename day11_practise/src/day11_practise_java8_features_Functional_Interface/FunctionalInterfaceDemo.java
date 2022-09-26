package day11_practise_java8_features_Functional_Interface;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		//1.By Creating a Class 
		Thread t1=new Thread(new MyThreadDemo());
		t1.start();
		
		//2. By using Anynamous of Runnable 
		Runnable r1=new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello I am Using Ananamous of Runnable ");
				
			}
			
		};
		Thread t2=new Thread(r1);
		t2.start();
		
		//3.By creating Ananomus at Thread Implemention
		
		Thread t3=new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello i am using Thread Ananmous class");
				
			}
			
		});
		t3.start();
		
		//4. using Functional Interface Cooncept on Runnable Interface
		Thread t4=new Thread(()->{
			System.out.println("Hello i am Runnable Method ");
		});
		t4.start();
		
		//5.using Functional Interface Conept on Thread Class Itself 
		Runnable t5=()->System.out.println("Hello i am Calling from Thread class");
		new Thread(t5).start();
	}

}
