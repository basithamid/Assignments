var BankAccount={
	accNo:1234,
	accBal:100000,
	withdraw:function(amt){
		this.accBal-=amt
		return this.accBal
	},
	deposit:function(amt){
		this.accBal+=amt
		return this.accBal
	}
}



function testAccount(){
	var account=Object.create(BankAccount)
	account.accNo=1000;
	account.accBal*=2;
	account.withdraw(12000)
	console.log(account)
	document.getElementById('display').innerHTML="Acc No"+account.accNo+"<br>Balance:"+account.accBal
}