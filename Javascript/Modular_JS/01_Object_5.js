function BankAccount(id,bal){
	this.accNo=id;
	this.accBal=bal;
}

BankAccount.prototype.withdraw=function(amt){
	this.accBal-=amt;
	return this.accBal
}

BankAccount.prototype.deposit=function(amt){
	this.accBal+=amt;
	return this.accBal
}

BankAccount.prototype.getAccNum=function(){
	return this.accNo
}

BankAccount.prototype.getAccBal=function(){
	return this.accBal
}

function testAccount(){
	var account=new BankAccount(1000,50000)
	account.withdraw(5000)
	account.deposit(1000)
	document.getElementById('display').innerHTML="Account number:"+account.getAccNum()+"<br>Balance:"+account.getAccBal()
}