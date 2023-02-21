import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class EmployeeserviceService {

  constructor(private http:HttpClient) { }

addemp(data:any){
  return this.http.post("http://localhost:8080/addemp/",data);
}
allemp(){
  return this.http.get("http://localhost:8080/allemp");
}
updateemp(data:any){
  return this.http.put("http://localhost:8080/updateemp/",data);
}
delete(data:Number){
  return this.http.delete("http://localhost:8080/deleteemp/"+data);
}
getemployeebyid(id:Number){
return this.http.get("http://localhost:8080/getemployeebyid/"+id);
}
getsortemp(str:String){
  return this.http.get("http://localhost:8080/sortedemp/"+str);
}
}
