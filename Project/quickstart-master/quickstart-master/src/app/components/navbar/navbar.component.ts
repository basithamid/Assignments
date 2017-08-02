import { Component } from '@angular/core'
import { AdvertisementService } from '../../services/AdvertisementService'
import { Router } from '@angular/router'
import { UserService } from '../../services/user.Service'

@Component({
    selector:'nav-bar',
    templateUrl:`./navbar.html`,
    styleUrls:['./navbar.css','./search.css'],
    styles: [`input.ng-invalid {border-bottom: 3px solid red}   input.ng-valid {border-bottom: 3px solid green}`]
})

export class NavbarComponent{
    public showSuccess:boolean=true;
    public showError:boolean=true;
    categoryArray:Array<any> = [];
    userName:string=''
    authToken:any=''
    loggedIn:boolean=false;
    constructor(private adService:AdvertisementService,private router:Router, private userService: UserService){
        adService.getCategories().subscribe((data)=>{
            for(let item of data.data.itemList){
                this.categoryArray.push(item.name)
            }
            console.log(this.categoryArray)
        })
        
    }

    serverLogin(loginForm:any){
        this.adService.loginService(loginForm).subscribe((res:any)=>{
            console.log(res.data)
            if(res.data['auth-token']!=null){
                this.userName=res.data.userId;
                this.authToken=res.data['auth-token']
                this.loggedIn=true;
                alert('Login Successful')
                console.log("Login Successful")
                sessionStorage.setItem('authenticationToken',this.authToken);
                sessionStorage.setItem('userId',this.userName)

            }
            document.getElementById('closeModal').click();
            this.router.navigate(['user-ads'])
        })
    }

    registration(registrationDetails:any){
        console.log(registrationDetails)
        this.adService.registrationService(registrationDetails).subscribe(
            (res:any)=>{
                this.showSuccess=false;
                this.showError=true;
            },
            (error:any)=>{
                this.showError=false;
                this.showSuccess=true;

            }

        )
    }

    signout(){
        this.userService.logoutService().subscribe(
            (response)=>{       console.log('hihihi')

            }
        )
    }
    

}

