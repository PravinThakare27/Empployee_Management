package com.yas.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yas.EmployeeManagement.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
