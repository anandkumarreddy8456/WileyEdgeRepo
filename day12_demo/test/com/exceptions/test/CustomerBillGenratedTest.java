package com.exceptions.test;



import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Billgenratedpack.BillGenratedApp;
import exceptions.ExceptionHandle;
import pojoclass.Customer;
import serlizeanddeserlize.Deserlize;
import serlizeanddeserlize.Serlize_Object;
import utilitypack.CustomerTotalBill;
import utilitypack.CustomerUtilityClass;

public class CustomerBillGenratedTest{
	@Test
	public void testBill() {
		Assert.assertEquals(50.0, CustomerTotalBill.totalBill(100),0.1);
		Assert.assertNotEquals(50.0,CustomerTotalBill.totalBill(56),0.1);
		Assert.assertEquals(137.5,CustomerTotalBill.totalBill(200),0.1);
		Assert.assertNotEquals(87.5,CustomerTotalBill.totalBill(114),0.1);
	}
	@Test
	public void ExceptionTest() {
		Assert.assertEquals(false, ExceptionHandle.checkId(-56+""));
		Assert.assertFalse(ExceptionHandle.checkId(-56+""));
		Assert.assertEquals(false, ExceptionHandle.checkId("asjcbdsij"));
		Assert.assertEquals(true, ExceptionHandle.checkId(5+""));
		new ExceptionHandle();
		Assert.assertEquals(true, ExceptionHandle.checkUnits(56+""));;
		Assert.assertNotEquals(true, ExceptionHandle.checkUnits(-56+""));
		Assert.assertNotEquals(true, ExceptionHandle.checkUnits("jaksl"));
	}
	@Test
	public void CustomerTotalBill() {
		Customer c1=new Customer(1,"Anand","516464",56);
		Customer c2=new Customer(1,"Anand","564789",69);
		Customer c3=new Customer(2,"Raju","658966",6230);
		Assert.assertNotEquals(c1.getCustomerId(), c3.getCustomerId());
		Assert.assertEquals(c1, c2);
		Assert.assertNotEquals(c1.getCustomerAreaCode(), c2.getCustomerAreaCode());
		Assert.assertNotEquals(c1.getCustomerTotalBill(),c2.getCustomerTotalBill());
		Assert.assertEquals(c1.hashCode(),c2.hashCode());
		Assert.assertNotEquals(c1.getNumberOfUnitsConsumed(), c2.getNumberOfUnitsConsumed());
		Assert.assertNotEquals(c1.toString(), c2.toString());
		Assert.assertNotEquals(c1.equals(c2), c1.equals(c3));
		new CustomerTotalBill();
	}
	@Test
	public void TestonCustomer() {
		Customer c2=new Customer();
		c2.setCustomerName("Ram");
		c2.setCustomerId(2);
		c2.setCustomerAreaCode("516464");
		c2.setNumberOfUnitsConsumed(56);
		Assert.assertEquals("Ram", c2.getCustomerName());
		Assert.assertNotEquals(1, c2.getCustomerId());
		Assert.assertNotEquals("51564", c2.getCustomerAreaCode());
		Assert.assertEquals(56, c2.getNumberOfUnitsConsumed());
	}
	@Test
	public void serlizeandDeserlie() {
		Customer c1=new Customer(1,"Anand","516464",569);
		new Serlize_Object();
		Serlize_Object.serlize(c1);
		new Deserlize();
		Deserlize.deserlize();
		Deserlize.printDeserlize();
	}
	@Test
	public void CustomertUtlity() {
		CustomerUtilityClass name= new CustomerUtilityClass();
		Customer c1=new Customer(1,"Anand","51546464",566);
		Customer c2=new Customer(2,"Raju","6616",1234);
		List<Customer> list=new ArrayList<>();
		list.add(c1);list.add(c2);
		name.sortByBillDecendingOrder(list);
		name.dosomething(list);
		name.getList(list, "6616");
		BillGenratedApp.utilityfun(list);
		BillGenratedApp.accessByArea(list, "51646");
		BillGenratedApp.serlize(list);
		BillGenratedApp.groupBy(list);
		
	}
}
