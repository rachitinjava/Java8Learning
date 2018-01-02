package com.learn.third;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientCustomer {

	public static void main(String[] args) {

		Configuration conf = new Configuration();
		conf.configure("com/learn/third/hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Customer c1 = new Customer();
		c1.setEmail("rachit.shah@gmail.com");
		c1.setAddress("my address");
		c1.setMobile("8551072909");
		c1.setName("Rachit");
		
		session.save(c1);
		
		Customer c2 = new Customer();
		c2.setEmail("rachit.shah@gmail.com");
		c2.setAddress("my address");
		c2.setMobile("8551072909");
		c2.setName("Payal");
		
		session.save(c2);
		
		Customer c3 = new Customer();
		c3.setEmail("rachit.shah@gmail.com");
		c3.setAddress("my address");
		c3.setMobile("8551072909");
		c3.setName("Shah");
		
		session.save(c3);
		
		session.flush();
		tx.commit();
		
		session.close();
	}

}
