import { Component } from '@angular/core'
import { FormGroup, FormControl, Validators, FormBuilder} from '@angular/forms'

@Component({
    selector:'form-builder',
    templateUrl:`./form-builder.html`,
    styles: [`input.ng-invalid {border-bottom: 3px solid red}   input.ng-valid {border-bottom: 3px solid green}`] 
})

export class MDFFormBuilder{
    productForm: FormGroup;
        constructor(private formBuilder:FormBuilder){
            this.productForm=this.formBuilder.group({
                name:[null,[Validators.required, Validators.minLength(5),Validators.maxLength(10)]],
                quantity:[1,Validators.required],
                price:[null,Validators.required]
            });
        }
        
        
    
}