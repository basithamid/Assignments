export function enhanced(){
    let orderObj = {id:10,
    title:"Milk",
    price:20,
    printOrder:function(){
        console.log("Order details: ",orderObj)
    },
    getPrice:function(){
        console.log("Order price: ",orderObj.price)
    }
}
   
    orderObj.printOrder();
    orderObj.getPrice();
    let copyObj={}
    Object.assign(copyObj,orderObj)
    console.log("Copied object = ",copyObj)
}