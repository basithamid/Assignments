export function assignment11(){
    let gen = getArmstrong();
    console.log(gen.next().value);
    console.log(gen.next().value);
    console.log(gen.next().value);
    console.log(gen.next().value);
    console.log(gen.next().value);
    console.log(gen.next().value);
    console.log(gen.next().value);
    console.log(gen.next().value);
    console.log(gen.next().value);
    console.log(gen.next().value);
}
function* getArmstrong(){
    let num=100;
    for(;;){
        let num_str = num.toString().split('');
        let len = num_str.length;
        let sum = 0;
        num_str.forEach(function(e) {
            parseInt(e);
            e = Math.pow(e,len);
            sum +=e;
        });

        if(sum === num){
            var f = yield num;
           // console.log('f= ',f)
            if(f==1){
                num = 0;
               
            }
        }
       
        num = num + 1;
        
        
        
    }
}




