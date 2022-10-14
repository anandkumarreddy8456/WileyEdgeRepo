package generatedBill;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import customerType.CustomerType;

import pojoclass.Consumption;
import pojoclass.Customer;

public class InputClass {

	public static List<Customer> main(Scanner sc) {

		System.out.println("Enter the Customer Details");
		List<Customer> list = new ArrayList<>();
		
		while (true) {
			System.out.println("Please Enter customerId");
			int cid = sc.nextInt();
			sc.nextLine();
			System.out.println("Please Enter customerName");
			String name = sc.nextLine();
			System.out.println("Please Enter 1 for Domestic or  2 for Commerical");
			String type=sc.next();
			CustomerType custType=(type.equals("1"))?CustomerType.DOMESTIC:CustomerType.COMMERCIAL;
			Customer obj=new Customer(cid, name, custType);
			list.add(obj);
			System.out.println("Do You want add Next Customer? Choose Yes or No");
			if (!sc.next().equalsIgnoreCase("Yes"))
				break;
		}
		return list;
	}

	public static List<Consumption> addConsumtion(Scanner sc,List<Customer> list) throws Exception{
		System.out.println("Enter the Consuption Details");
		List<Consumption> conList=new ArrayList<>();
		while(true) {
			System.out.println("Please Enter customerId");
			int cid = sc.nextInt();
			sc.nextLine();
			System.out.println("Please Enter Number of Months");
			int mon = sc.nextInt();
			System.out.println("Please Enter the Units Consumed");
			double units=sc.nextDouble();
			sc.nextLine();
			CustomerType s=getcustmerType(list, cid);
			double totalBill=s.getTotalBill(units);
			conList.add(new Consumption(cid, mon, units, totalBill));
			System.out.println("Do You want add Next Conumption Details? Choose Yes or No");
			if (!sc.next().equalsIgnoreCase("Yes"))
				break;
		}
		return conList;
	}
	public static CustomerType getcustmerType(List<Customer > list,int cid) {
		CustomerType temp=null;
		for(int i=0;i<list.size();i++) {
			Customer c1=list.get(i);
			if(c1.getCustomerId()==cid) {
				temp=c1.getCustomertype();
			}
		}
		return temp;
	}
	

}
