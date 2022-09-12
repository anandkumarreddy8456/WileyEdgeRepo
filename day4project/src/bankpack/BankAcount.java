package bankpack;

public class BankAcount {
	private int accountId;
	private String accountholdername;
	private double openingbalance;
	private double currentbalance;
	private double totalbalance;
	private static double bankbalance;
	public void depositAmount(double currentbalance) {
		if(currentbalance<0) {
			System.out.println("Invalid Amount");
			return;
		}
		this.currentbalance+=currentbalance;
		this.totalbalance+=currentbalance;
		bankbalance+=currentbalance;
		System.out.println("Thanks and your  Deposited Amount is : "+currentbalance);
		display(totalbalance);
		bankbalance();
		System.out.println("--------------------------------------");
	}
	private void display(double amount) {
		System.out.println("the totalBalance in Your Bank Account is : "+amount);
	}
	public void withdrawAmount(double currentbalance) {
		if(currentbalance>0 && currentbalance>=this.openingbalance && currentbalance<=this.totalbalance-this.openingbalance && currentbalance<=bankbalance) {
			this.currentbalance-=currentbalance;
			this.totalbalance-=currentbalance;
		bankbalance-=currentbalance;
		System.out.println("Thanks and your  Withdrawal Amount is : "+currentbalance);
		displayTotalBalance();
		bankbalance();
		}else {
			System.out.println("Invalid Amount or Minimum amount shoulbe available in your account or Insuffficent Balance");
			//System.out.println("Thanks and your  Withdrawal Amount is : "+currentbalance);
			return;
		}
		//System.out.println("Thanks and your  Withdrawal Amount is : "+currentbalance);
	}
	public void getCurrentBalance() {
		System.out.println("the CurrentBalance in your  Bank Account is : "+currentbalance);
		System.out.println("Thanks and your  Withdrawal Amount is : "+currentbalance);
		
	}
	public void bankbalance() {
		System.out.println("The cash Available at Bank is : "+bankbalance);
		//System.out.println("Thanks and your  Withdrawal Amount is : "+currentbalance);
	}
	public void displayTotalBalance() {
		//return this.totalbalance;
		System.out.println("the TotalBalance in your  Bank Account is : "+totalbalance);
		bankbalance();
	}
	public BankAcount(int accountId, String accountholdername, double openingbalance) {
		super();
		this.accountId = accountId;
		this.accountholdername = accountholdername;
		this.openingbalance = openingbalance;
		this.totalbalance=this.currentbalance+this.openingbalance;
		bankbalance+=this.totalbalance;
	}
	public BankAcount() {
		super();
	}
	public int getAccountId() {
		return accountId;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public double getTotalbalance() {
		return totalbalance;
	}
	
	
}
