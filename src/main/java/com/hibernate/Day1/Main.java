package com.hibernate.Day1;

import java.util.ArrayList;
import java.util.List;

import com.hibernate.Day2Mapping.Laptop;
import com.hibernate.Day2Mapping.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Student student= new  Student();
		
		student.setsId(1);
		student.setsName("robel");
		
Student student2= new  Student();
		
		student2.setsId(2);
		student2.setsName("dawit");
	
		List<Student> list2= new ArrayList<Student>();
		
		list2.add(student);
		list2.add(student2);
		
		
		Laptop laptop= new   Laptop();
		
		laptop.setLapId(1);
		laptop.setLapName("hp");
		laptop.setStudents(list2);
		
	Laptop laptop2= new   Laptop();
		
		laptop2.setLapId(2);
		laptop2.setLapName("Dell");
		laptop2.setStudents(list2);;
		
		List<Laptop> list= new ArrayList<Laptop>();
		
		list.add(laptop);
		list.add(laptop2);
		
		
		student.setLaptops(list);
		student2.setLaptops(list);
		
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		
		session.save(laptop);
		session.save(laptop2);
	session.save(student);
	session.save(student2);
		
//		
		transaction.commit();
		session.close();
		
		
		
		
		
		
	}

}
