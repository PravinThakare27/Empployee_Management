import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeserviceService } from '../employeeservice.service';

@Component({
  selector: 'app-employeeupdate',
  templateUrl: './employeeupdate.component.html',
  styleUrls: ['./employeeupdate.component.css']
})
export class EmployeeupdateComponent {
constructor(private route:ActivatedRoute,private router:Router,private service:EmployeeserviceService){}
id:any=0
emp:any;
data:any={
  "empId": 0,
  "empName": "",
  "empSalary": 0.0,
  "empAge": 0,
  "department": {
    "departmentType": "",
    "departmentId": 0,
    "departmentName": ""
  }
}
ngOnInit():void{
  this.route.queryParams.subscribe((param:any)=>{
    console.log("editid"+param)
    this.id=param.data;
    console.log(this.id)
    this.service.getemployeebyid(this.id).subscribe((result)=>{
      console.log(result)
      this.data=result;
    })
  })
}



empedit(){
console.log(this.data);
this.service.updateemp(this.data).subscribe((result)=>{
  console.log(result)
  this.router.navigateByUrl('');
})
}
}
