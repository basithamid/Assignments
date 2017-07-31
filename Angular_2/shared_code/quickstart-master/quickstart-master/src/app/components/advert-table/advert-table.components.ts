import { Component } from '@angular/core';
import {EventEmitter} from '@angular/core';
import { AdvertisementService } from '../../services/AdvertisementService'
@Component({
    selector: 'advert-table',
    templateUrl:'./advert-table.html'
    
    
})

export class AdvertTableComponent { 
    postAdArray:Array<any> = []; 

    constructor(private adService:AdvertisementService){
        this.postAdArray=adService.getAllAdvertises();
        console.log(this.postAdArray,'hahaha')
    }

    
    deleteAd(ad:any){
        this.adService.deleteAdvertise(ad)
        // let index = this.postAdArray.indexOf(ad);
        // this.postAdArray.splice(index,1)

    } 

}

