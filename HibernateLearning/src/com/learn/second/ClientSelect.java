package com.learn.second;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientSelect {

	public static void main(String[] args) throws InterruptedException {

		Configuration configuration = new Configuration();
		
		configuration.configure("com/learn/second/hibernate.cfg.xml");
		SessionFactory factory =  configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		Registration r = session.get(Registration.class, new Integer(1));
		
		Thread.sleep(5000);
		System.out.println(r.getName());
		tx.commit();
		
	}

}
