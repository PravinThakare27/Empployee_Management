package com.yas.EmployeeManagement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yas.EmployeeManagement.model.Employee;

@Component
public interface EmployeeService {
boolean SaveEmployee(Employee e);
boolean DeleteEmployee(int id);
boolean UpdateEmployee(Employee e);
List<Employee>getAllEmployee();
List<Employee> getAllEmployeeSalesDepartment();
List<Employee> getEmployeeSalaryGreaterthan();
Employee getEmployeeById(int id);
List<Employee> getempbycond(String cond);
}
