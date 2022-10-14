package pojoclass;

import customerType.CustomerType;

public class Customer {
	private int customerId;
	private String customerName;
	private CustomerType customertype;
	private int areaCode;
	public Customer() {
		super();
	}
	public Customer(int customerId, String customerName, CustomerType customertype) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customertype = customertype;
	}
	public Customer(int customerId, String customerName, CustomerType customertype, int areaCode) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customertype = customertype;
		this.areaCode = areaCode;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
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
	public CustomerType getCustomertype() {
		return customertype;
	}
	public void setCustomertype(CustomerType customertype) {
		this.customertype = customertype;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customertype="
				+ customertype + "]";
	}
	
}
