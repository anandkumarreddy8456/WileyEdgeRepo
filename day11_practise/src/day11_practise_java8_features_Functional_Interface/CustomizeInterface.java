package day11_practise_java8_features_Functional_Interface;
	

	//@FunctionalInterface will check whether we are following  the F.I conditions or not
@FunctionalInterface
public interface CustomizeInterface {
	//1. Only one Abstract in Functional Interface 
	public void rotate();// it is automatic abstact
	
	//2.Any Number number of Default Methods and static methods in F.I and only one abstract method
	
	public default void lookIt() {
		System.out.println("I am just Looking");
	}
	public static void cleanIt() {
		System.out.println("I am just to clean it ");
	}
	
}
