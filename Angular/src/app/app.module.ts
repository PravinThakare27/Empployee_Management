import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { MyFormComponent } from './my-form/my-form.component';
import { MynavbarComponent } from './mynavbar/mynavbar.component';
import { EmployeeserviceService } from './employeeservice.service';
import { HttpClientModule } from '@angular/common/http';
import { EmployeeupdateComponent } from './employeeupdate/employeeupdate.component';
import { EmployeedeleteComponent } from './employeedelete/employeedelete.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeelistComponent,
    MyFormComponent,
    MynavbarComponent,
    EmployeeupdateComponent,
    EmployeedeleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    BrowserModule

  ],
  providers: [EmployeeserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
