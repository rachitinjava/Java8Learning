package com.learn.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {

	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("com/learn/first/hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student student = new Student();
		student.setSno(1);
		student.setSname("Rachit");
		student.setMobile(8551072909L);
		student.setEmail("rachitinjava@gmail.com");
		
		session.save(student);
		
		session.flush();
		
		tx.commit();
		session.close();
		
	}
	
}
