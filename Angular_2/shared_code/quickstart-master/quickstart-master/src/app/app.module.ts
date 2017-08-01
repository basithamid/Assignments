import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import { AdvertProductFormComponent } from './components/advert-form/advert-form.component';

import { AdvertTableComponent } from './components/advert-table/advert-table.components';
import { TemplateForm } from './components/template-forms/template-form';
import { MDFFormComponent } from './components/MDF-form/mdf-forms.component';
import { MDFFormBuilder } from './components/formbuilder/mdfformbuilder.component';
import { HomeComponent } from './components/home-component/home.component';
import { EditComponent } from './components/edit-component/edit.component';

import { SearchPipe } from './pipes/search.pipe'

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router'; 

@NgModule({
  imports:      [ BrowserModule, ReactiveFormsModule, RouterModule.forRoot([
                  { path: "",component:HomeComponent},
                  { path: "edit/:name", component:EditComponent}
                ]) ],
  declarations: [ AppComponent, AdvertProductFormComponent, AdvertTableComponent, SearchPipe, MDFFormComponent, MDFFormBuilder, HomeComponent, EditComponent],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
