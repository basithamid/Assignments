import { Component } from '@angular/core';
import {EventEmitter} from '@angular/core';
import { AdvertisementService } from '../../services/AdvertisementService'
import { Router } from '@angular/router'
@Component({
    selector: 'advert-table',
    templateUrl:'./advert-table.html'
    
    
})

export class AdvertTableComponent { 
    postAdArray:Array<any> = []; 

    constructor(private adService:AdvertisementService, private router:Router){
        this.postAdArray=adService.getAllAdvertises();
        console.log(this.postAdArray)
    }

    
    deleteAd(ad:any){
        this.adService.deleteAdvertise(ad)
        // let index = this.postAdArray.indexOf(ad);
        // this.postAdArray.splice(index,1)

    } 

     

    updateProduct(ad:any){
        this.router.navigate(['/edit',ad.name])
    }

}

