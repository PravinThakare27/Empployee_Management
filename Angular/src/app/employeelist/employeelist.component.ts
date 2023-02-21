import { Component } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { EmployeeserviceService } from '../employeeservice.service';
@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent {
constructor(private service:EmployeeserviceService,private route:Router,private router:ActivatedRoute){}
data:any=[]
searchstr:any;
ngOnInit():void{
  // this.router.queryParams.subscribe((param:any)=>{
  //   console.log("editid"+param)
  //   this.newstr=param.data;
  //   console.log(this.newstr)
  // })
  // if(this.newstr!="self"){
  
  //  this.service.getsortemp(this.newstr).subscribe((result)=>{
  //     this.data=result;
  //   })
  

this.service.allemp().subscribe((result)=>{
  this.data=result
  console.log(result)
})
}

allemp(){
  
}
employeeDetails(id:Number){
  console.log(id);
  this.route.navigate(["/updateemp"],{queryParams:{data:id}});
}
employeedelete(id:any){
  console.log(id);
  this.service.delete(id).subscribe((result)=>{
    console.log(result);
    // this.route.navigateByUrl("");
    location.reload();
  })
}
Sortedemp()
{
  if(this.searchstr=="All"){
    location.reload();
    
  }
console.log(this.searchstr)
this.service.getsortemp(this.searchstr).subscribe((result)=>{
      this.data=result;
    })
    this.searchstr="All"
}


}
