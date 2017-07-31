import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name : 'search'})

export class SearchPipe implements PipeTransform{
    transform(value: any, ...args: any[]): any{
        let searchTxt = args[0];
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