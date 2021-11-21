import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductService } from './services/product.service';
import { HttpClientModule } from '@angular/common/http';
import { AdminComponent } from './components/admin/admin.component';
import { HomeComponent } from './components/home/home.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProductOrderDetailsComponent } from './components/product-order-details/product-order-details.component';
import { CallbackComponent } from './components/callback/callback.component';
import { AuthService } from './services/auth.service';
import { AuthGuard } from './services/auth.guard';

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    HomeComponent,
    ProductOrderDetailsComponent,
    CallbackComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [ProductService, AuthService, AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
