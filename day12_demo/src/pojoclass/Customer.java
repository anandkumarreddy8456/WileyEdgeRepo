package pojoclass;

import java.io.Serializable;


import utilitypack.CustomerTotalBill;

@SuppressWarnings("serial")
public class Customer implements Serializable{
	private int customerId;
	private String customerName;
	private String customerAreaCode;
	private int numberOfUnitsConsumed;
	@SuppressWarnings("unused")
	private double customerTotalBill;
	
	public Customer(int customerId, String customerName, String customerAreaCode, int numberOfUnitsConsumed) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAreaCode = customerAreaCode;
		this.numberOfUnitsConsumed = numberOfUnitsConsumed;
	}
	
	public Customer() {
		super();
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAreaCode() {
		return customerAreaCode;
	}
	public void setCustomerAreaCode(String customerAreaCode) {
		this.customerAreaCode = customerAreaCode;
	}
	public int getNumberOfUnitsConsumed() {
		return numberOfUnitsConsumed;
	}
	public void setNumberOfUnitsConsumed(int numberOfUnitsConsumed) {
		this.numberOfUnitsConsumed = numberOfUnitsConsumed;
	}
	
	public double getCustomerTotalBill() {
		return this.customerTotalBill=CustomerTotalBill.totalBill(numberOfUnitsConsumed);
	}
	
	@Override
	public int hashCode() {
		return customerId;
	}
	@Override
	public boolean equals(Object obj) {
		Customer other = (Customer) obj;
		return this.getCustomerId()==other.getCustomerId() && this.getCustomerName().equals(other.getCustomerName());
		}
	@Override
	public String toString() {
		
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAreaCode="
				+ customerAreaCode + ", numberOfUnitsConsumed=" + numberOfUnitsConsumed + ", customerTotalBill="
				+ CustomerTotalBill.totalBill(numberOfUnitsConsumed) + "]";
	}
	
}
