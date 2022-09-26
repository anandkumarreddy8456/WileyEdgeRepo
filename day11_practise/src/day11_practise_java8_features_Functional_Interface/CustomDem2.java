package day11_practise_java8_features_Functional_Interface;

public class CustomDem2 {

	public static void main(String[] args) {
		CustomSizeInterface2 cust=new CustomSizeInterface2() {
			
			@Override
			public int add(int a, int b) {
				
				return a+b;
			}
		};
		System.out.println("Add of Two Integers is:"+cust.add(15, 20));
		
//		CustomSizeInterface2 cust2=(int a,int b)->{
//			
//			public int add(int a,int b) {
//				return a+b;
//			}
//		};
		CustomSizeInterface2 cust2=(int a,int b)->{return a+b;};
		System.out.println(cust2.add(56, 65));
		
		CustomSizeInterface2 cust3=(a,b)->a+b;
		System.out.println(cust3.add(65, 32));
		
	}

}
