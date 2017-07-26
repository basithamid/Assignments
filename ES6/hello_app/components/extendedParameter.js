export function extended(){
    let add=(a=5,b=3)=>{ 
        console.log('Addition is ',a+b);
    }
       
    let userFriends=(userName,...friends)=>{
        console.log(userName,friends)
    }

    let printCapitalNames=(...names)=> console.log(  names.map( (e)=> e.toUpperCase()  )) 

    add();
    userFriends("Basit","Bhavdeep","Piyush","Rana")
    let arr=["Basit","Bhavdeep","Piyush","Rana","Shruti"]
    printCapitalNames(...arr);
    
}