package generatedBill;


import java.util.List;
import java.util.Scanner;

import dataDb.ConnectionDB;
import pojoclass.Consumption;
import pojoclass.Customer;

public class GenerateAPP {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		
		// 1.Register the Custmer
		List<Customer> list=InputClass.main(sc);
		// 1.Inserting Data Register Customer to DB
		ConnectionDB.insertValuesDb(list);
		// 2.Cretaing Consumtion
		List<Consumption> list2=InputClass.addConsumtion(sc,list);
		// 2.Inserting Data of Consumption into DB
		ConnectionDB.insertConcumptionValues(list2);
		// 3.List of All Customers;
		new ExcuteQuerryClass().listAllCustomers();
		// 3.Bill for ParticularMonth
		System.out.println("Please Enter the month is :");
		new ExcuteQuerryClass().billForAllCustomersForMonth(sc.nextInt());
		//3.Bill for ParticularMonth and particular Customer
		System.out.println("Please Enter the Customer is : ");
		int cid=sc.nextInt();
		System.out.println("Please Enter the month is :");
		int month=sc.nextInt();
		new ExcuteQuerryClass().billForParticulatCustForMonth(cid, month);
		//3 Bill total Bill of particularMonth
		System.out.println("Please Enter the month is :");
		int month2=sc.nextInt();
		new ExcuteQuerryClass().totalBillforParticularMonth(month2);
		//3 Displayed Bill for a month
		System.out.println("Please Enter the month is :");
		int month3=sc.nextInt();
		new ExcuteQuerryClass().customerListInAMonth(month3);
	}

}
