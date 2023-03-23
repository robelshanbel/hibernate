package com.hibernate.Day1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// DML 
		
		
		Employee employee= new Employee();
		
		employee.setEmpid(1);
		employee.setFirstName("hanna");
		employee.setLastName("fname");
		employee.setSalary(20000.00);
		employee.setDepartment(" react js");
		
		companyProfile companyProfile= new companyProfile();
		companyProfile.setComapanyname("Carft");
		companyProfile.setAddress("USA");
		companyProfile.setContactNum("+134343434");
		companyProfile.setCeo("abdul");
		
		employee.setCompanyProfile(companyProfile);
		
		
	Configuration config= new Configuration();
	config.configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
	SessionFactory sessionFactory= config.buildSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
	
	session.get(Employee.class, 1);
	
	
	
	transaction.commit();
	session.close();
		
	}

}
