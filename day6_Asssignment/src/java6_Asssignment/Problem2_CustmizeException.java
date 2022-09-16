package java6_Asssignment;

import java.util.Scanner;

public class Problem2_CustmizeException {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String email=sc.next();
		boolean val=email.endsWith("@gmail.com");
		if(val) {
			System.out.println("It is valid Email");
		}else {
			throw new CustomException(email);
		}
		sc.close();
	}

}
@SuppressWarnings("serial")
class CustomException extends RuntimeException{
	public CustomException(String s) {
		super(s);
	}
}
