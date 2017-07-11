function BackAccount(num,bal){
	this.accNo=num,
	this.accBal=bal,
	this.withdraw=function(amt){
		this.accBal-=amt;
		return this.accBal
	},
	this.deposit=function(amt){
		this.accNo+=amt;
		return this.accBal
	}
}

function testAccount(){
	var bank=new BackAccount(5363,100000)
	var bal=bank.accBal
	bank.withdraw(50000)
	document.getElementById('display').innerHTML="Account Number:"+bank.accNo+"<br>"+"Initial Balance:"+bal+"<br>"+"Final balance:"+bank.accBal
	//document.getElementById('display').innerHTML="AccNo:"+BankAccount.accNo+"<br>"+"Balance:"+BankAccount.accbal
}