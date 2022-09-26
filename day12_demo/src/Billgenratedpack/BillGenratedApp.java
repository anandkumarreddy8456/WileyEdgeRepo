package Billgenratedpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pojoclass.Customer;
import utilitypack.CustomerUtilityClass;

public class BillGenratedApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Please Enter Total Number");
//		int number=sc.nextInt();
		boolean flag=true;
		List<Customer> list =new ArrayList<>();int i=0;
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(new File("coustomer.txt")));
		while(flag ) {
			System.out.println("Please Enter Your CustomerId : ");
			int id=sc.nextInt();
			System.out.println("Please Enter Your CustomerName : ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Please Enter Your AreaCode : ");
			String area=sc.nextLine();
			System.out.println("Please Enter  Number_of_Units_Consumed : ");
			int units=sc.nextInt();
			list.add(new Customer(id,name,area,units));
			oos.writeObject(list.get(i++));//number--;if(number==0) break;
			System.out.println("Do You want to add Another Customer Bill(YES/NO) : ");
			flag=sc.next().equalsIgnoreCase("YES")?true:false;
			sc.nextLine();
		}
		

		//2.1 DisplayAllCustoers
		System.out.println("Customer all Details");
		new CustomerUtilityClass().displayAll(list);
		System.out.println("---------------------------------------------------------------------");
		//2.2 sort By Decending Order
		System.out.println("OrderbyDescendingOrder");
		new CustomerUtilityClass().sortByBillDecendingOrder(list);
		System.out.println("---------------------------------------------------------------------");
		//2.3 filter by AreaCode
		System.out.println("Please Enter the Area Access Code");
		String access=sc.next();
		System.out.println("filter by AreaAccessCode");
		new CustomerUtilityClass().searchbyAreaCode(list,access);
		System.out.println("---------------------------------------------------------------------");
		
		//3.Serlize and Deseelize
		oos.writeObject(new endoffile());
		oos.close();
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("coustomer.txt"));
		Object obj =null;
		while((obj=ois.readObject()) instanceof endoffile==false) {
			System.out.println(((Customer)obj).getCustomerId()+((Customer)obj).getCustomerName()+((Customer)obj).getCustomerAreaCode()+((Customer)obj).getNumberOfUnitsConsumed());
		}
		System.out.println("---------------------------------------------------------------------");
		//4.Group By AreaaCode
		new CustomerUtilityClass().dosomething(list);
		sc.close();
	}
	

}
@SuppressWarnings("serial")
class endoffile implements Serializable {
	
}
