package com.learn.second;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientUpdate {

	public static void main(String[] args) throws InterruptedException {

		Configuration configuration = new Configuration();
		
		configuration.configure("com/learn/second/hibernate.cfg.xml");
		SessionFactory factory =  configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		Registration r = session.get(Registration.class, new Integer(1));
	
		tx.commit();
		session.close();
		
		r.setName("shah");
		
		System.out.println(r.getName());
		Session newSession = factory.openSession();
		Transaction tx1 = newSession.beginTransaction();
		Registration r1 = newSession.get(Registration.class, new Integer(1));
		newSession.merge(r);
		tx1.commit();
		newSession.close();
	
	}

}
