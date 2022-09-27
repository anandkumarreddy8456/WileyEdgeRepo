package Billgenratedpack;

import java.io.File;
import exceptions.ExceptionHandle;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pojoclass.Customer;
import serlizeanddeserlize.Deserlize;
import serlizeanddeserlize.Serlize_Object;
import utilitypack.CustomerUtilityClass;

public class BillGenratedApp {

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Please Enter Total Number");
//		int number=sc.nextInt();
		boolean flag = true;
		List<Customer> list = new ArrayList<>();
		int i = 0;
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("coustomer.txt")));
		while (flag) {
			System.out.println("Please Enter Your CustomerId : ");
			int id = sc.nextInt();
			while (!ExceptionHandle.checkId(id + "")) {
				// id=sc.nextInt();
				System.out.println("Please Enter Your CustomerId : ");
				id = sc.nextInt();
			}
			System.out.println("Please Enter Your CustomerName : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Please Enter Your AreaCode : ");
			String area = sc.nextLine();
			System.out.println("Please Enter  Number_of_Units_Consumed : ");
			int units = sc.nextInt();
			while (!ExceptionHandle.checkUnits(units + "")) {
				// units=sc.nextInt();
				System.out.println("Please Enter  Number_of_Units_Consumed : ");
				units = sc.nextInt();
			}
			list.add(new Customer(id, name, area, units));
			oos.writeObject(list.get(i++));// number--;if(number==0) break;
			System.out.println("Do You want to add Another Customer Bill(YES/NO) : ");
			flag = sc.next().equalsIgnoreCase("YES") ? true : false;
			sc.nextLine();
		}
		utilityfun(list);
		System.out.println("Please Enter the Area Access Code");
		String access = sc.next();
		accessByArea(list, access);

		// 3.1.serlization
			serlize(list);
		// 4.Group By AreaaCode
		groupBy(list);
		sc.close();
	}

	public static void utilityfun(List<Customer> list) {
		// 2.1 DisplayAllCustoers
		System.out.println("Customer all Details");
		new CustomerUtilityClass().displayAll(list);
		System.out.println("---------------------------------------------------------------------");
		// 2.2 sort By Decending Order
		System.out.println("OrderbyDescendingOrder");
		new CustomerUtilityClass().sortByBillDecendingOrder(list);
		System.out.println("---------------------------------------------------------------------");

	}

	public static void accessByArea(List<Customer> list,String access) {
		// 2.3 filter by AreaCode
		
		System.out.println("filter by AreaAccessCode");
		new CustomerUtilityClass().searchbyAreaCode(list, access);
		System.out.println("---------------------------------------------------------------------");
	}
	public static void serlize(List<Customer> list) {
		for (Customer l1 : list)
			Serlize_Object.serlize(l1);
		// 3.1.2 Deserliation
		Deserlize.deserlize();
		Deserlize.printDeserlize();
	}
	public static void groupBy(List<Customer> list) {
		new CustomerUtilityClass().dosomething(list);
	}
}
