package com.exposures.hire.homework.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.exposures.hire.homework.bean.Employee;
@Repository("employeedao")
@Transactional
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao {

	public void addEmployee(Employee employee) {
		persist(employee);
	}

	public void deleteEmployee(int id) {
		delete(getEmployee(id));
	}

	public void updateEmployee(Employee employee) {
		getSession().update(employee);
	}

	
	public Employee getEmployee(int id) {
		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id", id));		
		return (Employee) criteria.uniqueResult();
	}

	public List<Employee> getEmployees() {
		Criteria criteria = getSession().createCriteria(Employee.class);	
		return (List<Employee>)criteria.list();
	}

}
