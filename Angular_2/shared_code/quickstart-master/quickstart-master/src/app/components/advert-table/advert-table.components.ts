import { Component } from '@angular/core';

@Component({
    selector: 'advert-table',
    templateUrl:'./advert-table.html',
    inputs: ['postAdArray']
})

export class AdvertTableComponent { 
    public postAdArray:Array<object>;  
}

