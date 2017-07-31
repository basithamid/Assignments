import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import { AdvertProductFormComponent } from './components/advert-form/advert-form.component';

import { AdvertTableComponent } from './components/advert-table/advert-table.components';
import { TemplateForm } from './components/template-forms/template-form';
import { MDFFormComponent } from './components/MDF-form/mdf-forms.component'
import { MDFFormBuilder } from './components/formbuilder/mdfformbuilder.component'

import { SearchPipe } from './pipes/search.pipe'

import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  imports:      [ BrowserModule, ReactiveFormsModule ],
  declarations: [ AppComponent, AdvertProductFormComponent, AdvertTableComponent, SearchPipe, MDFFormComponent, MDFFormBuilder],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
