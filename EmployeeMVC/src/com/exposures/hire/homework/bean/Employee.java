package com.exposures.hire.homework.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="employee")
public class Employee implements Serializable{
	@Id
	private int id;
	@Column(name="emp_name")
	private String empName;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Column(name="emp_salary")
	private int empSalary;
	@Column(name="emp_department")
	private String embDepatrment;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String empName, Date startDate, int empSalary, String embDepatrment) {
		super();
		this.id = id;
		this.empName = empName;
		this.startDate = startDate;
		this.empSalary = empSalary;
		this.embDepatrment = embDepatrment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmbDepatrment() {
		return embDepatrment;
	}
	public void setEmbDepatrment(String embDepatrment) {
		this.embDepatrment = embDepatrment;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", startDate=" + startDate + ", empSalary=" + empSalary
				+ ", embDepatrment=" + embDepatrment + "]";
	}
	
	
}
