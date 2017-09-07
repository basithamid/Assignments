import { Injectable } from '@angular/core'
import { Http,Response,Headers, RequestOptions } from '@angular/http'


@Injectable()

export class UserService{
    url:any='http://localhost:8002/advertisement';
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

    getMyAds(){
        let header = new Headers();
        header.append('auth-token',sessionStorage.getItem('authenticationToken'))
        let options = new RequestOptions({headers:header});
        return this._http.get(this.url+'/posts',options).map((response:Response)=>response.json())
    }

    logoutService(){
        let header = new Headers();
        header.append('auth_token',sessionStorage.getItem('authenticationToken'))
        console.log('auth_token',sessionStorage.getItem('authenticationToken'))
        let options = new RequestOptions({headers:header});
        return this._http.delete(this.url+'/logout',options)
    }

    postAdService(postAdForm:any){
        console.log('ad details',postAdForm)
        let header = new Headers();
        header.append('Content-Type','application/json')
        header.append('auth-token',sessionStorage.getItem('authenticationToken'))
        console.log('auth-token',sessionStorage.getItem('authenticationToken'))
        let options = new RequestOptions({headers:header});
        console.log("stringify form: ", JSON.stringify(postAdForm));
        return this._http.post(this.url+'/postAd',JSON.stringify(postAdForm),options).map((response:Response)=>response.json())
    }

    actionOnAd(){
        let header = new Headers();
        header.append('auth-token',sessionStorage.getItem('authenticationToken'))
        let options = new RequestOptions({headers:header});
        return this._http.get(this.url+'/actions',options).map((response:Response)=>response.json())
    }

    removeAd(postAd:string){
        let header = new Headers();
        header.append('auth-token',sessionStorage.getItem('authenticationToken'))
        let options = new RequestOptions({headers:header});
        return this._http.delete(this.url+'/post?postId='+postAd,options)
    }
    
    searchAdsByCategory(category:string){
        return this._http.get(this.url+'/posts/search?category='+category).map((response:Response)=>response.json())
    }
    
}