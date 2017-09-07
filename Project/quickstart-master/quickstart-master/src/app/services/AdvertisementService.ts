import { Injectable } from '@angular/core';
import { Http,Response,Headers, RequestOptions } from '@angular/http'
import 'rxjs/add/operator/map'

@Injectable()

export class AdvertisementService{
    adArray:Array<any> = [];
    authToken:any;
    userName:string;
    url:string='http://localhost:8002/advertisement'
    constructor(private _http:Http){
        
    }

    getCategories(){
        return this._http.get(this.url+'/categories').map((response:Response)=>response.json())
    }

    loginService(login_details:any):any{
        console.log("login details: ", login_details)
        let header = new Headers({'Content-Type':'application/json'});
        let options = new RequestOptions({headers:header});
        return this._http.post(this.url+'/login',JSON.stringify(login_details),options).map((response:Response)=>response.json())
    }

    registrationService(registrationDetails:any):any{
        let header = new Headers({'Content-Type':'application/json'});
        let options = new RequestOptions({headers:header});
        return this._http.post(this.url+'/register',JSON.stringify(registrationDetails),options).map((response:Response)=>response.json())

    }

    setUserInfo(auth:any,uname:string){
        this.authToken=auth;
        this.userName=uname;
    }

    getUserInfo(){
        let userInfo = {authToken:this.authToken,userName:this.userName}
        return userInfo;
    }

}