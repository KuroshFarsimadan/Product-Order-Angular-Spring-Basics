import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './components/admin/admin.component';
import { CallbackComponent } from './components/callback/callback.component';
import { HomeComponent } from './components/home/home.component';
import { ProductOrderDetailsComponent } from './components/product-order-details/product-order-details.component';
import { AuthGuard } from './services/auth.guard';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'admin/view/:id',
    component: ProductOrderDetailsComponent,
    canActivate: [AuthGuard]
  },
  {
    path: 'admin',
    component: AdminComponent,
    canActivate: [AuthGuard]
  }, 
  {
    path: 'callback',
    component: CallbackComponent
  }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
