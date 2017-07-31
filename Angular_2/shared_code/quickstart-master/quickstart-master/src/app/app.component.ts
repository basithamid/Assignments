import { Component } from '@angular/core';
import { AdvertisementService } from './services/AdvertisementService'

@Component({
  selector: 'my-app',
  template: `<advert-form></advert-form>
             <advert-table ></advert-table>`,
  providers:[AdvertisementService]
})

export class AppComponent  { 

}

