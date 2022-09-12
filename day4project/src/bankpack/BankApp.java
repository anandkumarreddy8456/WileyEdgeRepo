package bankpack;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountType saving=BankAccountType.SAVING;
		BankAccountType current=BankAccountType.CURRENT;
		BankAcount b1=new BankAcount(12345,"Anand",saving.getMinimumBalance());
		BankAcount b2=new BankAcount(125,"Kumar",current.getMinimumBalance());
		BankAcount b3=new BankAcount(563,"Reddy",saving.getMinimumBalance());
		b1.bankbalance();
		b1.depositAmount(5000);
		b2.depositAmount(6000);
		b3.depositAmount(6000);
		b1.withdrawAmount(4500);
		b2.withdrawAmount(5000);
		b3.withdrawAmount(8000);
		b1.bankbalance();
		b1.getTotalbalance();
		b2.getTotalbalance();
		
	}

}
