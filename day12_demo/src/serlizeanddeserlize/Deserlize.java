package serlizeanddeserlize;

import java.io.File;
import java.io.FileInputStream;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.*;

import pojoclass.Customer;

@SuppressWarnings("serial")
public class Deserlize implements Serializable {

	static List<Customer> de = new ArrayList<Customer>();

	public static void deserlize() {
		// for(Customer customer:cust) {
		// List<Customer> decustomers;
		try {
			FileInputStream fis = new FileInputStream(new File("customer.txt"));
			ObjectInputStream obs = new ObjectInputStream(fis);
			Customer c1 = (Customer) obs.readObject();
			de.add(c1);
		} catch (Exception e) {
			
		}

	}

	public static void printDeserlize() {
		de.forEach((list) -> {
			System.out.println(list);
		});
	}

}
