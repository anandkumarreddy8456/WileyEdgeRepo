package java6_Asssignment;

public class Problem6_BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount(123,"Anand", AccountType.CURRENT);
		account.calculateTotalIntrest(-250, 1);
	}

}
class BankAccount{
	private int accountId;
	private String accountName;
	private AccountType accountType;
	
	public BankAccount(int accountId, String accountName, AccountType accountType) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountType = accountType;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public  void calculateTotalIntrest(double amount,int years) {
		try {
			if(amount<0) {
				throw new DepositAmountException();
			}
		}
		catch(DepositAmountException e) {
			return;
		}
		accountType.setYears(years);
		double val=(amount*accountType.rateOfIntrest())/100;
		System.out.println("Total Intrest is "+val);
	}
	
	
}
@SuppressWarnings("serial")
class DepositAmountException extends  RuntimeException{
	DepositAmountException(){
		System.out.println("Please Enter Valid Amount");
	}
}
enum AccountType{
	SAVINGS(10),CURRENT(24);
	int years;
	private int rate;
	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	AccountType(int rate) {
		this.rate=rate;
	}

	public double rateOfIntrest() {
		return rate*years;
	}
}
