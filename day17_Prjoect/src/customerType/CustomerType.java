package customerType;

public enum CustomerType {
	DOMESTIC(1),COMMERCIAL(2);
	int rate;
	private CustomerType(int rate) {
		this.rate=rate;
	}
	public double getTotalBill(double units) {
		return this.rate*units;
	}
	
}
