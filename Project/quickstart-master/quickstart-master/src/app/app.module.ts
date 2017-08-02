import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { NavbarComponent } from './components/navbar/navbar.component'
import { FooterComponent } from './components/footer/footer.component'
import { HomeComponent } from './components/home-component/home.component'
import { UserAdsComponent } from './components/user-ads/user-ads.component'

import { HttpModule } from '@angular/http'
import { AdvertisementService } from './services/AdvertisementService'
import { RouterModule } from '@angular/router'


@NgModule({
  imports:      [ BrowserModule, FormsModule, HttpModule, RouterModule.forRoot([
                  { path: '', component:HomeComponent },
                  { path: 'user-ads', component:UserAdsComponent}]) ] ,
  declarations: [ AppComponent, NavbarComponent, FooterComponent, HomeComponent, UserAdsComponent],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
