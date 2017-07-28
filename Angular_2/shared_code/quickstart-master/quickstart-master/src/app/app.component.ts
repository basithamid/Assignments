import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  template: `<advert-form (adArray)="pushAd($event)"></advert-form>
             <advert-table [postAdArray] = "advertisements"></advert-table>`,
})
export class AppComponent  { 
  advertisements:Array<object>=[] ;
  pushAd(ad:object){
    this.advertisements.push(ad)
    console.log(this.advertisements)
  }
}

