import { Component } from '@angular/core'
import { UserService } from '../../services/user.Service'
import { AdvertisementService } from '../../services/AdvertisementService'
import { Router } from '@angular/router'


@Component({
    selector:'postAD',
    templateUrl:`./postAd.html`,
    styleUrls:['./postAd.css']
})

export class PostAdComponent{
    categoryArray:Array<any>=['Choose Category'];
    constructor(private adService:AdvertisementService, private userService:UserService, private router:Router){
        this.adService.getCategories().subscribe((data)=>{
            for(let item of data.data.itemList){
                this.categoryArray.push(item.name)
            }
            console.log('categories',this.categoryArray)
        });
    }

    formSubmit(postAdForm:any){
        this.userService.postAdService(postAdForm).subscribe(
            (response:any)=>{
                console.log('success')
                alert('Succussfully added')
                this.router.navigate(['/user-ads'])
            },
            (error:any)=>{
                console.log('failed')
            }

        )
    }
}