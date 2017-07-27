let accObj:Array<object>
class Account {
    acc_id:number;
    acc_name:string;
    balance:number;
    constructor(id:number,name:string,balance:number){
        this.acc_id=id;
        this.acc_name=name;
        this.balance=balance;
    }
   
}

class Saving extends Account {
    interest:number;
    constructor(acc_id:number,name:string,balance:number,interest:number){
        super(acc_id,name,balance)
        this.interest=interest;
    }
    totalBal():number{
        return this.interest + this.balance;
    }
}

class Current extends Account {
    cash_credit:number;
    constructor(acc_id:number,name:string,balance:number,cash_credit:number){
        super(acc_id,name,balance)
        this.cash_credit=cash_credit;
    }
    totalBal():number{
        return this.cash_credit + this.balance;
    }
}


    let savings_1:Saving=new Saving(1,'Basit',50000,1000)
    let savings_2:Saving=new Saving(2,'Bhavdeep',40000,2000)
    let current_1:Current=new Current(3,'Piyush',30000,2000)
    let current_2:Current=new Current(4,'Ammar',20000,1000)
    
    accObj = [savings_1,savings_2,current_1,current_2]
 

function getTotalCashInBank():void {
    let tot_bal:number = 0;
    for(var i in accObj){
        tot_bal+=accObj[i].totalBal();
    }
    console.log(tot_bal)
}


getTotalCashInBank();
