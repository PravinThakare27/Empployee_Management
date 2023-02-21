package com.yas.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.EmployeeManagement.model.Employee;
import com.yas.EmployeeManagement.service.EmployeeService;
import com.yas.EmployeeManagement.service.imple.EmployeeServiceImple;

@RestController
@CrossOrigin("*")
public class EmployeeController {
@Autowired
EmployeeService empser;

@PostMapping("/addemp/")
boolean addEmp(@RequestBody Employee e) {
	System.out.println(e);
	return empser.SaveEmployee(e);
	
}
@GetMapping("/allemp")
List<Employee> allemp(){
	return empser.getAllEmployee();
}
@PutMapping  ("/updateemp")
boolean updateemp(@RequestBody Employee e){
	return empser.UpdateEmployee(e);
}
@DeleteMapping("/deleteemp/{id}")
boolean deleteemp(@PathVariable int id){
	System.out.println("deleteid"+id);
	return empser.DeleteEmployee(id);
}
@GetMapping("/getemployeebyid/{id}")
Employee getEmployeeById(@PathVariable int id) {
	System.out.println("id"+id);
	return empser.getEmployeeById(id);
}
@GetMapping("/sortedemp/{id}")
List<Employee> sortedempbycondition(@PathVariable("id") String cond){
	System.out.println(cond);
	return empser.getempbycond(cond);
	//return null;
	
}

}
