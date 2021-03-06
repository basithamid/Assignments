class Account{
	double amount;
	Account(){
		this.amount=100000;
	}

	Account(double amt){
		this.amount=amt;
	}

	public void setAmount(double amount){
		this.amount=amount;
	}
	public double getAmount(){
		return this.amount;
	}

	public void deposit(double depositAmount){
		this.amount += depositAmount;
	}

	public void withdraw(double withdrawAmount){
		this.amount -= withdrawAmount;
	}

	public void print(){
		System.out.println("The balance in this account is: "+this.amount);
	}
}

public class AccountTest{
	public static void main(String args[]){
		Account newAccount = new Account();
		newAccount.print();
		newAccount.deposit(25000);
		newAccount.print();
		newAccount.withdraw(10000);
		newAccount.print();
	}
}