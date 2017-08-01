import { Component } from '@angular/core';
import { AdvertisementService } from './services/AdvertisementService'

@Component({
  selector: 'my-app',
  template: `<router-outlet></router-outlet>`,
  providers:[AdvertisementService]
})

export class AppComponent  { 

}

