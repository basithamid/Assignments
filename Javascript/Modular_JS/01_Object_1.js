var	BankAccount = {
	accNo:123,
	accbal:50000,
	accName:"Basit",
	withdraw:function(amt){
		this.accbal-=amt;
		//console.log(accbal)
	},
	deposit:function(amt){
		this.accbal=this.accbal+amt;
	}

}

function testAccount(){
	console.log(BankAccount)
	BankAccount.deposit(10000)
	console.log(BankAccount.accbal)
	document.getElementById('display').innerHTML="AccNo:"+BankAccount.accNo+"<br>"+"Balance:"+BankAccount.accbal
}