export function arrow_func(){
    let names = ['Tom', 'Ivan', 'Jerry']
    let ary=[]
    names.map(
        (n) => {
            let obj={name:n, length:n.length}
            ary.push(obj)
        } 
    )
    console.log(ary)
}