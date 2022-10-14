package dataDb;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import pojoclass.Consumption;
import pojoclass.Customer;

public class ConnectionDB {

	private static  String url;
	private static String username;
	private static String pass;
	static {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("Applications.propeties"));
			url=(String)prop.get("url");
			username=(String) prop.get("user");
			pass=(String)prop.get("password");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public static  Connection connect() {
		try {
			return DriverManager.getConnection(url, username, pass);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void insertValuesDb(List<Customer> list) throws Exception {
		Connection con=ConnectionDB.connect();
		Statement st=con.createStatement();
		//drop table
		st.execute("drop table customer");
		//create table 
		st.execute("create table customer(customerid int primary key,customerName varchar(40),customerType varchar(40))");
		//Insert the data
		PreparedStatement statement=con.prepareStatement("insert into customer values(?,?,?)");
		for(int i=0;i<list.size();i++) {
			statement.setInt(1, list.get(i).getCustomerId());
			statement.setString(2,list.get(i).getCustomerName());
			statement.setString(3,list.get(i).getCustomertype()+"");
			statement.executeUpdate();
		}
		
		System.out.println("Insertion of Customer Details To Db is Completed");
		
	}
	public static void insertConcumptionValues(List<Consumption> list) throws Exception {
		Connection con=ConnectionDB.connect();
		Statement st=con.createStatement();
		//drop table
		st.execute("drop table Consumption");
		// create table
		st.execute("create table Consumption(customerId int primary key,month int,unitsConsumed float,totalBill float)");
		//Insert the data
		PreparedStatement statement = con.prepareStatement("insert into Consumption values(?,?,?,?)");
		for (int i = 0; i < list.size(); i++) {
			statement.setInt(1, list.get(i).getCustomerid());
			statement.setInt(2, list.get(i).getMonth());
			statement.setDouble(3, list.get(i).getUnitsConcumed());
			statement.setDouble(4, list.get(i).getTotalBill());
			statement.executeUpdate();
		}
		//statement.executeUpdate();
		System.out.println("Insertion of Consumption Details To Db is Completed");
	}
	


}
