import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/services/product.service';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-product-order-details',
  templateUrl: './product-order-details.component.html',
  styleUrls: ['./product-order-details.component.css']
})
export class ProductOrderDetailsComponent implements OnInit {

  public productOrder: any;

  constructor(private productService: ProductService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.getProductOrderDetails(this.route.snapshot.params['id']);
  }

  getProductOrderDetails(id: number) {
    this.productService.getProduct(id).subscribe (
      data => {
        this.productOrder = data;
      },
      err => console.error(err),
      () => console.log("Error")
    );
  }

}
