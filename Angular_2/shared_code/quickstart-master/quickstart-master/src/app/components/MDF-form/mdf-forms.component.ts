import { Component } from '@angular/core'
import { FormGroup, FormControl, Validators, FormBuilder} from '@angular/forms'

@Component({
    selector:'product-mdf',
    templateUrl:`./mdf-form.html`,
    styles: [`input.ng-invalid {border-bottom: 5px solid red}   input.ng-valid {border-bottom: 5px solid green}`] 
})

export class MDFFormComponent{
    productForm = new FormGroup({
        name: new FormControl(null,[Validators.required, Validators.minLength(5),Validators.maxLength(10)]),
        quantity: new FormControl(1,[Validators.required]),
        price: new FormControl(null,[Validators.required])
    });
}