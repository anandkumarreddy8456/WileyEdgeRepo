package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExceptionHandlind {
		
	//Exception :An wanted or unexpected event that disturb the normal flow of program
	//			To Handle the exception is highly preffer with doesn't terminate program
	//			try,catch,finally,throw, throws
	
	// 			Throwable is super/root class of Exception and errors
	// 			Checked exceptions :  Checked at Compile Time
	//			unchecked exceptions : Checked at Runtime
	//			Partial Checked exceptions : Throwable,Exception
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//try -catch Block
		int val1=50,val2=0;
		try {
			System.out.println("Divide the number "+val1/val2);
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());	
		}
		//try -with Multi Catch Block
		try {
			System.out.println("Divide the number "+val1/val2);
			FileInputStream value=new FileInputStream(new File("anand.txt"));
			
		}
//		catch(Exception e) {
//			-->Follow the Hireachy Rule 
//		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//try catch Finally
		try {
			System.out.println("Divide the number "+val1/val2);
			FileInputStream value=new FileInputStream(new File("anand.txt"));
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			//   it is excuted whether Exeption has raised or not  except this case System.exit(0)
			System.out.println("File Has Closed");
		}
		System.out.println(add());
		
	}
	@SuppressWarnings({ "unused", "finally" })
	public static int add() {
		try {
			//System.out.println(10/0);
			FileInputStream value=new FileInputStream(new File("anand.txt"));
			return 5;
		}
		catch(ArithmeticException e) {
			return 0;
		}
		catch(FileNotFoundException e1) {
			return 63;
		}
		finally {
			return 50;
		}
	}

}
