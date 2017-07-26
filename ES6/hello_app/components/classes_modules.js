let accObj=[]
class Account {
    constructor(id,name,balance){
        this.acc_id=id;
        this.acc_name=name;
        this.balance=balance;
    }
   
}

class Saving extends Account {
    constructor(acc_id,name,balance,interest){
        super(acc_id,name,balance)
        this.interest=interest;
    }
   totalBal(){
        return this.interest + this.balance;
    }
}

class Current extends Account {
    constructor(acc_id,name,balance,cash_credit){
        super(acc_id,name,balance)
        this.cash_credit=cash_credit;
    }
    totalBal(){
        return this.cash_credit + this.balance;
    }
}


    let savings_1=new Saving(1,'Basit',50000,1000)
    let savings_2=new Saving(2,'Bhavdeep',40000,2000)
    let current_1=new Current(3,'Piyush',30000,2000)
    let current_2=new Current(4,'Ammar',20000,1000)
    
    accObj = [savings_1,savings_2,current_1,current_2]
 

function getTotalCashInBank() {
    var tot_bal = 0;
    for(var i in accObj){
        tot_bal+=accObj[i].totalBal();
    }
    console.log(tot_bal)
}

export {getTotalCashInBank}