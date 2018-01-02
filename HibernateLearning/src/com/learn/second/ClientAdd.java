package com.learn.second;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientAdd {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("com/learn/second/hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory(); 
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Registration registration = new Registration();
		registration.setRegid(3);
		registration.setName("Payal");
		registration.setEmail("rachitinjava@gmail.com");
		registration.setMobile("8551072909");
		registration.setAddress("Pune");
		
		session.save(registration); 
		session.flush();
		tx.commit();
		
		System.out.println(session.contains(registration));
		
		session.evict(registration);
		
		System.out.println(session.contains(registration));

		session.close();
		
	}

}
