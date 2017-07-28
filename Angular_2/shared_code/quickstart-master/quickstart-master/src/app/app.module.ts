import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import { AdvertProductFormComponent } from './components/advert-form/advert-form.component';

import { AdvertTableComponent } from './components/advert-table/advert-table.components';

import { SearchPipe } from './pipes/search.pipe'
@NgModule({
  imports:      [ BrowserModule ],
  declarations: [ AppComponent, AdvertProductFormComponent, AdvertTableComponent, SearchPipe],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
