import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import { AdvertProductForm } from './components/advert-form/advert-form.component';
@NgModule({
  imports:      [ BrowserModule ],
  declarations: [ AppComponent, AdvertProductForm ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
