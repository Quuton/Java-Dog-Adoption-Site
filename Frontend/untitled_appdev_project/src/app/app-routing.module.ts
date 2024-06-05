import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { HomeComponent } from './home/home.component';
import { ListComponent } from './list/list.component';
import { LoginComponent } from './login/login.component';
import { DogFormComponent } from './dog-form/dog-form.component';
import { EditFormComponent } from './edit-form/edit-form.component';
import { DogListComponent } from './dog-list/dog-list.component';
const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'admin', component: AdminComponent },
  { path: 'home', component: HomeComponent },
  { path: 'all', component: ListComponent },
  { path: 'login', component: LoginComponent },
  { path: 'add-dog', component: DogFormComponent },
  { path: 'list-dog', component: DogListComponent },
  { path: 'edit-dog', component: EditFormComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
