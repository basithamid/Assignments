import { Component } from '@angular/core';
import { AdvertisementService } from './services/AdvertisementService'
import { UserService } from './services/user.Service'

@Component({
  selector: 'my-app',
  template:`<nav-bar></nav-bar>
            <router-outlet></router-outlet>
            <myfooter></myfooter>`
  ,
  providers:[AdvertisementService, UserService]
 
})

export class AppComponent  { 

}

