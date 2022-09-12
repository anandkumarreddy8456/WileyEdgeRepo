package bankpack;

public enum BankAccountType {
	SAVING(500),CURRENT(1000);
	 int num;
	private BankAccountType(int num) {
		this.num=num;
	}
	public int getMinimumBalance() {
		return num;
	}
	
}

