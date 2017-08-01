import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router'
import { AdvertisementService } from '../../services/AdvertisementService' 


@Component({
    selector:'edit',
    templateUrl:'./edit.html'
})

export class EditComponent implements OnInit {
    title:'Edit Ad';
    categoriesArray:Array<string> = ['Furniture', 'Hardware', 'Mobile']
    constructor(private activatedRoute:ActivatedRoute, private service:AdvertisementService ){}
    customerName:string;
    quant:number;
    cate:string;
    des:string;
    obj:any;
   
    ngOnInit(){
        this.customerName=this.activatedRoute.snapshot.params['name']
        console.log("in edit");
        this.obj = this.service.getAdvertise(this.customerName);
        console.log(this.obj,'called from update button')
        // this.cate = 
    }

    updateProduct(){
        
    }


    
   
}