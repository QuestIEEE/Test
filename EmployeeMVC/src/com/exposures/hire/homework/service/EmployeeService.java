package com.exposures.hire.homework.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exposures.hire.homework.bean.Employee;

@Service("Employeeservice")
@Transactional
public interface EmployeeService {
	void addEmployee(Employee employee);
	void deleteEmployee(int id);
	void updateEmployee(Employee employee);
	Employee getEmployee(int id);
	List<Employee> getEmployees();
}
