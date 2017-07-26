let prevNo = Symbol();
let currNo = Symbol();
class Fibonacci {
    constructor(p,c){
        this[prevNo]=p;
        this[currNo]=c;
        
    }
    next(){
            [this[prevNo],this[currNo]] = [this[currNo], this[prevNo] + this[currNo]];
            return {value:this[currNo], done:false};
        }
}



export function iterate(){
 
    


    let fibo = new Fibonacci(0,1);
    
    console.log(fibo.next());
    console.log(fibo.next());
    console.log(fibo.next());
    console.log(fibo.next());
    console.log(fibo.next());
    console.log(fibo.next());
}


