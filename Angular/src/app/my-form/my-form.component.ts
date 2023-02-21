import { Component,OnInit } from '@angular/core';


import { EmployeelistComponent } from '../employeelist/employeelist.component';
import { EmployeeserviceService } from '../employeeservice.service';
import { FormControl, FormGroup,FormBuilder } from '@angular/forms'
import { Router } from '@angular/router';
@Component({
  selector: 'app-my-form',
  templateUrl: './my-form.component.html',
  styleUrls: ['./my-form.component.css']
})
export class MyFormComponent {
constructor(private service:EmployeeserviceService,private route:Router){}
requiredForm=new FormGroup({
        empName:new FormControl(''),
        empSalary:new FormControl(0.0),
        empAge:new FormControl(0),
        department:new FormGroup({
          departmentType:new FormControl(''),
          departmentName:new FormControl('')
          
        })
});
addemp(){
  console.log(this.requiredForm.value)
  this.service.addemp(this.requiredForm.value).subscribe((result)=>{
    this.route.navigateByUrl("");
  });
  }

}
