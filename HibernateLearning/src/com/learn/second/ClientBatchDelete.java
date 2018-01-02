package com.learn.second;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientBatchDelete {
	
	public static void main(String[] args) throws InterruptedException {

Configuration configuration = new Configuration();
		
		configuration.configure("com/learn/second/hibernate.cfg.xml");
		SessionFactory factory =  configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Query q = session.createQuery("FROM Registration r where r.regid > 0"); //This naming is as per POJO
		
		List<Registration> list = q.list();
		
		int count = 0;
		
		for(Registration r: list){
			count++;
			session.delete(r);
			if(count++%1000==0){
				session.flush();
				count = 0;
			}
			Thread.sleep(3000);
		}
		session.flush();
		tx.commit();
		session.close();
	}
}
