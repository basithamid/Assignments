import { Component, EventEmitter } from '@angular/core';

@Component({
    selector:'advert-form',
    templateUrl: './advert.html',
    outputs:['adArray']
})

export class AdvertProductFormComponent { title='Product Form' 
    categoriesArray:Array<string> = ['Furniture', 'Hardware', 'Mobile']
    customerName:string='Basit'

    

    addProduct(Name:string,Qty:string,Category:string,Desc:string){
        this.adArray.emit({name:Name,qty:Qty,category:Category,desc:Desc});
    }

    public adArray = new EventEmitter<object>();
    
}

