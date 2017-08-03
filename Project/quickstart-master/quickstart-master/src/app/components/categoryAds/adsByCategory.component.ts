import { Component, OnInit } from '@angular/core'
import { UserService } from '../../services/user.Service'
import { ActivatedRoute } from '@angular/router'; 

@Component({
    selector:'adsByCategory',
    templateUrl:`./adsByCategory.html`,
    styleUrls:['./ads.css']
})

export class AdsByCategoryComponent{
    category:string;
    flag = false;
    adsByCategory:Array<any>;
    constructor(private userService:UserService, private activatedRoute:ActivatedRoute){
        this.activatedRoute.params.subscribe((value:any)=>{
            this.category=value.category
            this.search();
        })
    console.log('category ads',this.category)  
    this.search()
    }
    
 search():any{
    this.flag=true;
     if(this.flag==true){
        this.userService.searchAdsByCategory(this.category).subscribe(
            (response)=>{
                this.adsByCategory=response.data.advertiseList;
                console.log('ads by category',this.adsByCategory)
                this.category=null;
        })
    } 
 }
    
}