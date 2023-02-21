package com.yas.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yas.EmployeeManagement.model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
