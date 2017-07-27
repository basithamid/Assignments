var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var accObj;
var Account = (function () {
    function Account(id, name, balance) {
        this.acc_id = id;
        this.acc_name = name;
        this.balance = balance;
    }
    return Account;
}());
var Saving = (function (_super) {
    __extends(Saving, _super);
    function Saving(acc_id, name, balance, interest) {
        var _this = _super.call(this, acc_id, name, balance) || this;
        _this.interest = interest;
        return _this;
    }
    Saving.prototype.totalBal = function () {
        return this.interest + this.balance;
    };
    return Saving;
}(Account));
var Current = (function (_super) {
    __extends(Current, _super);
    function Current(acc_id, name, balance, cash_credit) {
        var _this = _super.call(this, acc_id, name, balance) || this;
        _this.cash_credit = cash_credit;
        return _this;
    }
    Current.prototype.totalBal = function () {
        return this.cash_credit + this.balance;
    };
    return Current;
}(Account));
var savings_1 = new Saving(1, 'Basit', 50000, 1000);
var savings_2 = new Saving(2, 'Bhavdeep', 40000, 2000);
var current_1 = new Current(3, 'Piyush', 30000, 2000);
var current_2 = new Current(4, 'Ammar', 20000, 1000);
accObj = [savings_1, savings_2, current_1, current_2];
function getTotalCashInBank() {
    var tot_bal = 0;
    for (var i in accObj) {
        tot_bal += accObj[i].totalBal();
    }
    console.log(tot_bal);
}
getTotalCashInBank();
