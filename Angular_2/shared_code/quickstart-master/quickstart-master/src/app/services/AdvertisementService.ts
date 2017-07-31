import { Injectable } from '@angular/core';

@Injectable()

export class AdvertisementService{
    adArray:Array<any> = [];
    setAdvertise(ad:any):void{
        console.log(ad)
        this.adArray.push(ad);
        //console.log(this.adArray)
    }

    getAllAdvertises(){
        console.log(this.adArray)
        return this.adArray;
    }

    deleteAdvertise(ad:any):void{
        let index = this.adArray.indexOf(ad);
        this.adArray.splice(index,1)
        console.log(this.adArray)
    }

    updateAdvertise(){

    }

    getAdvertise(){

    }
}