import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }

  getProducts() {
    return this.http.get('/server/api/v1/products');
  }

  getProduct(id: number) {
    return this.http.get('/server/api/v1/products/' + id);
  }


  createProduct(product: any) {
    let body = JSON.stringify(product);
    return this.http.post('/server/api/v1/products', product, httpOptions);
  }
}
