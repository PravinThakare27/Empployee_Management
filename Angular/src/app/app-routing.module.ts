import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeedeleteComponent } from './employeedelete/employeedelete.component';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { EmployeeupdateComponent } from './employeeupdate/employeeupdate.component';
import { MyFormComponent } from './my-form/my-form.component';

const routes: Routes = [
  {
    path:'',component:EmployeelistComponent
  },
  {
    path:'addemp',component:MyFormComponent
  },
  {
    path:'updateemp',component:EmployeeupdateComponent
  },
  {
    path:'deleteemp',component:EmployeedeleteComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
