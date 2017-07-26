export function destructure() {
    let [,,c,] = [1,2,3,4]
    console.log('C:',c)

    let organObj = {
        name:'Xoriant',
        address: {
            pincode:411014
        }
    };
    let {address:{pincode}}=organObj;
    console.log('Pin code:', pincode)
} 