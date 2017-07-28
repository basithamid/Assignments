import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name : 'search'})

export class SearchPipe implements PipeTransform{
    transform(value: Array<object>,searchTxt:string){
        let matchingAds=[];
        console.log(value)
        
        for(let item of value ){
            if(item.name.includes(searchTxt) ||  item.category.includes(searchTxt)){
                console.log(true)
                matchingAds.push(item)
            }
            
        }
        return matchingAds;
    }
}