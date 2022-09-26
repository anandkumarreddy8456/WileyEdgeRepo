package day11_practise_java8_features_Functional_Interface;

public class CustomDemo1 {

	public static void main(String[]rags) {
		
		//1.First Way of Using Functional Interface
		CustomizeInterface c1=new CustomizeInterface() {
			
			@Override
			public void rotate() {
				System.out.println("Hello i can rotate");
				
			}
		};
		c1.rotate();
		//2.second way Using Funcional Interface
		
		CustomizeInterface c2=()-> {System.out.println("Hello i optimize method");};
			c2.rotate();
		CustomizeInterface c3=()->System.out.println("Hello I am fully optimized method");	
		c3.rotate();
//		()->{System.out.println("Start invention without Object");}.rotate();
//		
		
	}

}
