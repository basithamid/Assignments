import { Component, EventEmitter } from '@angular/core';
import { AdvertisementService } from '../../services/AdvertisementService';

@Component({
    selector:'advert-form',
    templateUrl: './advert.html',
    // outputs:['adArray']
    
})

export class AdvertProductFormComponent { title='Product Form' 
    categoriesArray:Array<string> = ['Furniture', 'Hardware', 'Mobile']
     customerName:string='Basit'
    //public adService:Array<object>;
     constructor(private adService:AdvertisementService) {
        
    }
    addProduct(Name:string,Qty:string,Category:string,Desc:string){
         let productObj:any={name:Name,qty:Qty,category:Category,desc:Desc}
         this.adService.setAdvertise(productObj)
     }
    //     this.adArray.emit({name:Name,qty:Qty,category:Category,desc:Desc});
    // }
    // public adArray = new EventEmitter<object>();
    
}

