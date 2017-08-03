import { Component } from '@angular/core'
import { AdvertisementService } from '../../services/AdvertisementService'
import { UserService } from '../../services/user.Service'
import { Router } from '@angular/router'


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
    myAds:Array<any>;
    userActions:Array<any>;
    updateAction:string;
    deleteAction:string;
    postId:string;
    constructor(private userService:UserService, private router:Router){
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

        userService.getMyAds().subscribe(
            (response)=>{
                this.myAds=response.data.mypostList;
                console.log('my ads',this.myAds)
                console.log('successfully displayed ads')
            },
            (error)=>{
                console.log('error')
            }
        )

        userService.actionOnAd().subscribe(
            (response)=>{
                this.userActions=response.data.actionList;
                this.updateAction=this.userActions[0].name;
                this.deleteAction=this.userActions[1].name;
                
            },
            (error)=>{
                console.log('actions failed')
            }
        )
    }
    deleteAd(postId:string){
        console.log('deleteAd(postID):',postId)
        this.userService.removeAd(postId).subscribe(
            (response)=>{
                console.log("successfully deleted")
                this.router.navigate(['/user-ads'])
            }
        )
    }

    
}