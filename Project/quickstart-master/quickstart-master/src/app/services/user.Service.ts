import { Injectable } from '@angular/core'
import { Http,Response,Headers, RequestOptions } from '@angular/http'

@Injectable()

export class UserService{
    url:any='http://192.168.3.144:9000';
    authToken:any;
    userName:string;
    
    constructor(private _http:Http){

    }
    getUserInformation(){
        let header = new Headers();
        header.append('auth-token',sessionStorage.getItem('authenticationToken'))
        console.log('header',header)
        header.append('Content-Type','application/json')
        let options = new RequestOptions({headers:header});
        return this._http.get(this.url+'/user?userId='+sessionStorage.getItem('userId'),options).map((response:Response)=>response.json())
    }

    logoutService(){
        let header = new Headers();
        header.append('auth-token',sessionStorage.getItem('authenticationToken'))
        console.log('auth-token',sessionStorage.getItem('authenticationToken'))
        let options = new RequestOptions({headers:header});
        return this._http.delete(this.url+'/logout',options)
    }

    
}