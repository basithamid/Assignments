class BankAccount{
	private double balance;
	private int accId;
	public BankAccount(int accId, double balance){
		this.accId = accId;
		this.balance = balance;
	}
	public double getBalance(){
		return this.balance;
	}
}

class Savings extends BankAccount{
	private double fixedDeposit;
	public Savings(int accId, double balance, double fixedDeposit){
		super(accId,balance);
		this.fixedDeposit = fixedDeposit;
	}
	public double getBalance(){
		return (super.getBalance() + this.fixedDeposit);
	}
}

class Current extends BankAccount{
	private double cashCredit;
	public Current(int accId, double balance, double cashCredit){
		super(accId,balance);
		this.cashCredit = cashCredit;
	}
	public double getBalance(){
		return (super.getBalance() + this.cashCredit);
	}
}

public class BankAccountTest{
	public static double getBankBalance(BankAccount account[]){
		double balance = 0;
		for(int i=0; i<3; i++){
			balance += account[i].getBalance();
		}
		return balance;
	}
	public static void main(String args[]){
		int id; double balance;
		BankAccount account[] = new BankAccount[3];
		account[0] = new Savings(1,10000,5000);
		account[1] = new Current(2,20000,7000);
		account[2] = new Current(3,50000,12000);
		double totalMoneyInBank = getBankBalance(account);
		System.out.println("Total Money in Bank: "+totalMoneyInBank);
	}

	
}	