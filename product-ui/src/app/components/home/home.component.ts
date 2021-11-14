import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Observable } from 'product-ui/node_modules/rxjs/dist/types';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  productForm:  any = FormGroup;
  productModels: string[] = [
    "Product one",
    "Product two",
    "Product three"
  ];
  validationMessage: string = "";

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productForm = new FormGroup (
      {
        name: new FormControl('', Validators.required),
        description: new FormControl('', Validators.required),
        email: new FormControl('', Validators.required),
        phone: new FormControl('', Validators.required),
        model: new FormControl('', Validators.required),
        serialNumber: new FormControl('', Validators.required),
        orderPrice: new FormControl('', Validators.required),
        orderDate: new FormControl('', Validators.required),
        hasBeenContacted:  new FormControl(null, Validators.required),
      }
    );
  }
  createProductRegistration(): void {
    console.log("Submitted");
    console.log(this.productForm.valid);
    console.log(this.productForm);
  
    if(this.productForm.valid) {
      this.productForm.controls['hasBeenContacted'].setValue(true);
      this.validationMessage = "Your product order has been submitted.";
      this.productService.createProduct(this.productForm.value).subscribe (
        data => {
          this.productForm.reset();
          return true;
        },
        error => {
          console.log("Error in creating product order");
        }
      )
    }
  }

}


