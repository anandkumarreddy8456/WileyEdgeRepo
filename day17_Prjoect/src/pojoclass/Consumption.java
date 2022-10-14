package pojoclass;



public class Consumption {
	
	private int customerid;
	private int month;
	private double unitsConcumed;
	private double totalBill;
	
	public Consumption(int customerid, int month, double unitsConcumed, double totalBill) {
		super();
		this.customerid = customerid;
		this.month = month;
		this.unitsConcumed = unitsConcumed;
		this.totalBill = totalBill;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public double getUnitsConcumed() {
		return unitsConcumed;
	}
	public void setUnitsConcumed(double unitsConcumed) {
		this.unitsConcumed = unitsConcumed;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	
}	
