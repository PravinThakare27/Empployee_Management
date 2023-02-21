import { Component } from '@angular/core';
import { EmployeeserviceService } from './employeeservice.service';
import { Route, Router } from '@angular/router';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'employeemanagement';
  searchstr:any;
  constructor(private service:EmployeeserviceService,private route:Router){}
  Sortedemp(){
    this.route.navigate([""],{queryParams:{data:this.searchstr}});
    // console.log(this.searchstr)
    // this.service.getsortemp(this.searchstr).subscribe((result)=>{
    //   console.log(result)
    // })
      }
}
