
package com.yas.EmployeeManagement.model;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="emp_id")
 int EmpId;
@Column(name="emp_name")
 String EmpName;
@Column(name="emp_salary")
 double EmpSalary;
@Column(name="emp_age")
 int EmpAge;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name = "department_id")
 Department department;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empId, String empName, double empSalary, int empAge, Department department) {
	super();
	EmpId = empId;
	EmpName = empName;
	EmpSalary = empSalary;
	EmpAge = empAge;
	this.department = department;
}
public int getEmpId() {
	return EmpId;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public double getEmpSalary() {
	return EmpSalary;
}
public void setEmpSalary(double empSalary) {
	EmpSalary = empSalary;
}
public int getEmpAge() {
	return EmpAge;
}
public void setEmpAge(int empAge) {
	EmpAge = empAge;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
}
