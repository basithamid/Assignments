interface Printable {
    print:()=> void   
}

let circle:Printable={
    print:():void=> console.log('circle')
}

let employee:Printable={
    print:():void=> console.log('employee')
}

function PrintAll(c:Printable,e:Printable):void{
    c.print()
    e.print()
}

PrintAll(circle,employee)