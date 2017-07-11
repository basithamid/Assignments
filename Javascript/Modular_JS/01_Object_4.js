function BankAccount(accNum,accBall){
	var accNo=accNum;
	var accBal=accBall;
	return{
		withdraw: function(amt){
			accBal-=amt;
			return accBal
		},
		deposit: function(amt){
			accBal+=amt;
			return accBal
		},
		getAccNu:function(){
			return accNo
		},
		getAccBal:function(){
			return accBal
		}
	}
};

function testAccount(){
	var account=new BankAccount(1000,100000);
	var amt=account.withdraw(50000);
	console.log(amt);
	amt=account.deposit(10000);
	console.log(amt);
	document.getElementById('display').innerHTML="account number:"+account.getAccNu()+"<br>Account Balance:"+account.getAccBal()
};