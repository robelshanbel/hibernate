package com.hibernate.Day1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "employee_table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id" )
	private int empid;
	@Column(name = "empFname" , nullable = false )
	private String firstName;
	@Column(name = "empLname" , nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private Double salary;
	
	private String department;
	
	@Transient
	private int netTax;
	
	private companyProfile companyProfile;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getNetTax() {
		return netTax;
	}

	public void setNetTax(int netTax) {
		this.netTax = netTax;
	}

	public companyProfile getCompanyProfile() {
		return companyProfile;
	}

	public void setCompanyProfile(companyProfile companyProfile) {
		this.companyProfile = companyProfile;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", department=" + department + ", netTax=" + netTax + ", companyProfile=" + companyProfile + "]";
	}
	
	
	
}
