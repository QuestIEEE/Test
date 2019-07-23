package com.exposures.hire.homework.dao;

import java.util.List;

import com.exposures.hire.homework.bean.Employee;


public interface EmployeeDao {
	void addEmployee(Employee employee);
	void deleteEmployee(int id);
	void updateEmployee(Employee employee);
	Employee getEmployee(int id);
	List<Employee> getEmployees();

}
