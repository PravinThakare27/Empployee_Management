package com.yas.EmployeeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Department {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="department_id")
 int DepartmentId;
@Column(name="department_name")
 String DepartmentName;
@Column(name="department_type")
 String DepartmentType;
public int getDepartmentId() {
	return DepartmentId;
}
public void setDepartmentId(int departmentId) {
	DepartmentId = departmentId;
}
public String getDepartmentName() {
	return DepartmentName;
}
public void setDepartmentName(String departmentName) {
	DepartmentName = departmentName;
}
public String getDepartmentType() {
	return DepartmentType;
}
public void setDepartmentType(String departmentType) {
	DepartmentType = departmentType;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(int departmentId, String departmentName, String departmentType) {
	super();
	DepartmentId = departmentId;
	DepartmentName = departmentName;
	DepartmentType = departmentType;
}
@Override
public String toString() {
	return "Department [DepartmentId=" + DepartmentId + ", DepartmentName=" + DepartmentName + ", DepartmentType="
			+ DepartmentType + "]";
}

}
