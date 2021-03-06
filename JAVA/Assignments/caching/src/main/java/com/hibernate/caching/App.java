package com.hibernate.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        
        //cachingInsert(sessionFactory);
        caching(sessionFactory);
        sessionFactory.close();
    }
    private static void caching(SessionFactory sessionFactory) throws InterruptedException {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Product prod = session.get(Product.class, 1L);
		prod.setName("PSP");
		session.persist(prod);
		tx.commit();
		session.close();
//		Thread.sleep(6000);
		Session session2 = sessionFactory.openSession();
		Transaction ty = session2.beginTransaction();
		Thread.sleep(6000);
		session2 = sessionFactory.openSession();
		prod = session2.get(Product.class, 1L);
		prod.setName("PSP2");
		ty.commit();
		session2.close();
		
	}
	public static void cachingInsert(SessionFactory sessionFactory){
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	Product prod = new Product("PS3", 15000);
    	session.persist(prod);
    	prod = new Product("PS4", 24000);
    	session.persist(prod);
    	tx.commit();
    	session.close();
    	
    }
}
