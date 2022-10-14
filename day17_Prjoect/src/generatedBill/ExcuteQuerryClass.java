package generatedBill;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dataDb.ConnectionDB;

public class ExcuteQuerryClass {

	public  void listAllCustomers() throws Exception{
		Connection con=ConnectionDB.connect();
		Statement statement=con.createStatement();
		ResultSet res=statement.executeQuery("select * from customer");
		System.out.println("List of All Customers");
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3)+" "+res.getString(4));
		}
		res.close();
		statement.close();
		con.close();
		System.out.println("---------------------------------------------------------------");
	}
	public void billForAllCustomersForMonth(int month) throws Exception{
		Connection con=ConnectionDB.connect();
		Statement statement=con.createStatement();
		System.out.println("Total Bill of  All Customers for "+month+" Month is :");
		ResultSet res=statement.executeQuery("select customerid, totalBill from Consumption where month="+month);
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getDouble(2));
		}
		res.close();
		statement.close();
		
		System.out.println("---------------------------------------------------------------");
	}
	public void billForParticulatCustForMonth(int cid,int month) throws Exception{
		Connection con=ConnectionDB.connect();
		Statement statement=con.createStatement();
		System.out.println("Bill of customer id :"+cid+" in the month of "+month);
		ResultSet res=statement.executeQuery("select customerid, totalBill from Consumption where month="+month+" and customerid="+cid);
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getDouble(2));
		}
		res.close();
		statement.close();
		System.out.println("---------------------------------------------------------------");
	}
	public void totalBillforParticularMonth(int month) throws Exception{
		Connection con=ConnectionDB.connect();
		Statement statement=con.createStatement();
		System.out.println("Total Bill for "+month+" month is :");
		ResultSet res=statement.executeQuery("select sum(totalBill) from Consumption where month="+month);
		while(res.next()) {
			System.out.println(res.getDouble(1));
		}
		res.close();
		statement.close();
		System.out.println("---------------------------------------------------------------");
	}
	public void customerListInAMonth(int month) throws Exception{
		Connection con=ConnectionDB.connect();
		Statement statement=con.createStatement();
		System.out.println("List of Customer for "+month+" month is : ");
		ResultSet res=statement.executeQuery("select c.customerid,c.customerName ,cu.totalbill from customer c join consumption cu on c.customerId=cu.customerId where month ="+month+" order by cu.totalbill desc");
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getDouble(3));
		}
		res.close();
		statement.close();
	}
	
}
