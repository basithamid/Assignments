import { Injectable } from '@angular/core';

@Injectable()

export class AdvertisementService{
    adArray:Array<any> = [];
    setAdvertise(ad:any):void{
        //console.log(ad)
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

    getAdvertise(name:string):any{
        for(let ad of this.adArray){
            if(ad.name==name){
                return ad;
            }
        }
       
        // this.adArray.forEach((f)=>
        // {
        //     if(f.name === name)
        //     {
        //         console.log(f,"service");
        //         return f.name;
        //     }
        // })
    }
}