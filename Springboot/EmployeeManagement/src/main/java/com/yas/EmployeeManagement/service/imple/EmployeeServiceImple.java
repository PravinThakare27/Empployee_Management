package com.yas.EmployeeManagement.service.imple;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.EmployeeManagement.model.Department;
import com.yas.EmployeeManagement.model.Employee;
import com.yas.EmployeeManagement.repository.DepartmentRepository;
import com.yas.EmployeeManagement.repository.EmployeeRepository;
import com.yas.EmployeeManagement.service.EmployeeService;

@Service
public class EmployeeServiceImple implements EmployeeService {
	@Autowired
	EmployeeRepository employeerepo;
	@Autowired
	DepartmentRepository departmentrepo;
	String newstr="";
	String oper="";
	@Override
	public boolean SaveEmployee(Employee e) {
		// TODO Auto-generated method 
		Department d=e.getDepartment();
		d.setDepartmentId(0);
		d.setDepartmentName(d.getDepartmentName());
		d.setDepartmentType(d.getDepartmentType());
		
		Employee e1=employeerepo.save(e);
		departmentrepo.save(d);
		return (e1!=null)?true:false;
		
	}

	@Override
	public boolean DeleteEmployee(int id) {
		// TODO Auto-generated method stub
		Employee e1=employeerepo.findById(id).get();
		if(e1.getEmpId()==id) {
		employeerepo.deleteById(id);
		return true;
		}
		return false;
	}

	@Override
	public boolean UpdateEmployee(Employee e) {
		// TODO Auto-generated method stub
		Employee e1=employeerepo.save(e);
		return (e1!=null)?true:false;	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeerepo.findAll();
	}

	@Override
	public List<Employee> getAllEmployeeSalesDepartment() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Employee> getEmployeeSalaryGreaterthan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeerepo.findById(id).get();
	}

	@Override
	public List<Employee> getempbycond(String cond) {
		// TODO Auto-generated method stub
		
		String[] str=cond.split(" ");
		System.out.println(str.length);
		if(str.length>1) {newstr=str[1].trim();
		oper=str[0].trim();
		}
		else {
			newstr=str[0].trim();
		}
		System.out.println(Arrays.toString(str));
		System.out.println("newstr"+newstr);
		//String oper=str[0].substring(1).trim();
	//	System.out.println(newstr);
		boolean isNumeric1 = isNumeric(newstr); 
		//System.out.println(oper+" "+str[1].substring(0,str[1].length()-1)+" "+isNumeric1+" "+">".equals(oper));
		
		if(">".equals(oper) && isNumeric1==true) {
			System.out.println("greater");
			List<Employee> e=employeerepo.findAll().stream().filter(emp->emp.getEmpSalary()>Integer.parseInt(newstr)).collect(Collectors.toList());
			return e;
		}
		else if("<".equals(oper) && isNumeric1==true)
		{
			System.out.println("less");
			List<Employee> e=employeerepo.findAll().stream().filter(emp->emp.getEmpSalary()<Integer.parseInt(newstr)).collect(Collectors.toList());
			return e;
		}
		else {
			System.out.println("dept"+newstr);
			List<Employee> e=employeerepo.findAll().stream().filter(emp-> newstr.trim().equals(emp.getDepartment().getDepartmentType())).collect(Collectors.toList());
			return e;
		}
		
	}
List<Employee> sortemp(){
	
	return null;
	
}
public static boolean isNumeric(String string) {
    int intValue;
		
    System.out.println(String.format("Parsing string: \"%s\"", string));
		
    if(string == null || string.equals("")) {
        System.out.println("String cannot be parsed, it is null or empty.");
        return false;
    }
    
    try {
        intValue = Integer.parseInt(string);
        return true;
    } catch (NumberFormatException e) {
        System.out.println("Input String cannot be parsed to Integer.");
    }
    return false;
}
}
