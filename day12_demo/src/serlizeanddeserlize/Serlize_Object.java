package serlizeanddeserlize;

import java.io.File;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;
import java.io.Serializable;


import pojoclass.Customer;

@SuppressWarnings("serial")
public class Serlize_Object implements Serializable{

	public static void serlize(Customer c1) {
		//Customer customer=new Customer(c1.getCustomerId(),c1.getCustomerName(),c1.getCustomerAreaCode(),c1.getNumberOfUnitsConsumed());
		
		try {
			FileOutputStream fis=new FileOutputStream(new File("customer.txt"));
			ObjectOutputStream obs=new ObjectOutputStream(fis);
			obs.writeObject(c1);
			obs.close();
		}catch(Exception e) {
			
		}
	}

}
