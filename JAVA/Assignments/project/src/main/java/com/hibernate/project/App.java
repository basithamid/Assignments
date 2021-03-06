package com.hibernate.project;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        insert(sessionFactory);
        insertSql(sessionFactory);
//        update(sessionFactory);
//        delete(sessionFactory);
        getAll(sessionFactory);
//        getUpdateMerge(sessionFactory);
        
        sessionFactory.close();
    }
    public static void insertSql(SessionFactory sessionFactory){
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	SQLQuery sqlQuery = session.createSQLQuery("INSERT INTO PRODUCT_MASTER VALUES(p_id.nextval,'PSP',5000)");
    	sqlQuery.executeUpdate();
    	sqlQuery = session.createSQLQuery("INSERT INTO PRODUCT_MASTER VALUES(p_id.nextval,'PSP2',5500)");
    	sqlQuery.executeUpdate();
    	tx.commit();
    	session.close();
    	System.out.println("Inserted");
    	
    }
      
    public static void insert(SessionFactory sessionFactory){
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	Product product = new Product("Play Station 3", 18000);
    	Product product1 = new Product("Play Station 4", 24000);
    	session.persist(product);
    	session.persist(product1);
    	tx.commit();
    	session.close();
    	
    	session = sessionFactory.openSession();
    	tx = session.beginTransaction();
    	product = new Product("Play Station 1", 1000);
    	product1 = new Product("Play Station 4", 2000);
    	session.persist(product);
    	session.persist(product1);
    	tx.commit();
    	session.close();
    	System.out.println("Inserted");
    	
    }
    
    public static void update(SessionFactory sessionFactory){
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	Product product = session.load(Product.class, 1L);
    	product.setPrice(15000);
    	tx.commit();
    	session.close();
    }
    public static void delete(SessionFactory sessionFactory){
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	Product product = session.load(Product.class, 1L);
    	session.delete(product);
    	tx.commit();
    	session.close();
    }
    
    public static void getAll(SessionFactory sessionFactory){
    	Session session = sessionFactory.openSession();
    	Query query = session.createQuery("from Product");
    	List<Product> list = query.list();
    	System.out.println("Products:"+list);
    	session.close();
    }
    
    public static void getUpdateMerge(SessionFactory sessionFactory){
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	Product product = session.load(Product.class, 1L);
    	product.setPrice(12000);
    	session.update(product);
    	tx.commit();
    	session.close();
    	
    	product.setPrice(10000); //detached
    	
    	session = sessionFactory.openSession();
    	tx = session.beginTransaction();
    	Product product_2 = session.load(Product.class, 1L);
    	
    	session.merge(product);
    	tx.commit();
    	session.close();
    	
    }
}
