package com.exposures.hire.homework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exposures.hire.homework.bean.Employee;
import com.exposures.hire.homework.dao.EmployeeDao;
@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}

	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}

	
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

	
	public Employee getEmployee(int id) {
		return employeeDao.getEmployee(id);
	}

	
	public List<Employee> getEmployees() {
		return employeeDao.getEmployees();
	}

}
