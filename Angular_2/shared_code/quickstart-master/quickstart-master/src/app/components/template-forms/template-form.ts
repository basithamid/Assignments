import { Component } from '@angular/core';

@Component({
    selector:'template-form',
    templateUrl:`./template1.html`
})

export class TemplateForm {
    categoriesArray:Array<string> = ['Furniture', 'Hardware', 'Mobile']
}