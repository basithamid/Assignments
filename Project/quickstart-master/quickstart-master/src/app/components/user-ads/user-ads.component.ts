import { Component } from '@angular/core'
import { AdvertisementService } from '../../services/AdvertisementService'
import { UserService } from '../../services/user.Service'


@Component({
    selector:'user-ads',
    templateUrl:'./user-ads.html',
    styleUrls:['./user-ads.css'],
    providers:[UserService]
})

export class UserAdsComponent{
    
    authToken:any;
    userName:string;
    userInfo:any;
    firstName:string;
    lastName:string;
    email:string;
    phone:string;
    constructor(private userService:UserService){
        userService.getUserInformation().subscribe(
            (response)=>{
                this.userInfo=response.data
                console.log(this.userInfo)
                this.firstName=this.userInfo.user.firstName
                this.lastName=this.userInfo.user.lastName
                this.userName=this.userInfo.user.userName
                this.email=this.userInfo.user.email
                this.phone=this.userInfo.user.phone
        })
    }

    



}