package com.hibernate.project2;

import java.util.List;

import org.hibernate.Query;
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
    public static void main( String[] args )
    {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
//        insert(sessionFactory);
//        totalSalary(sessionFactory);
//        listEmpBySal(sessionFactory);
//        groupByCity(sessionFactory);
//        getAvgSal(sessionFactory);
        empSalGt10000(sessionFactory);
        
    }
    
    private static void groupByCity(SessionFactory sessionFactory) {
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	Query query=session.createQuery("SELECT SUM(E.salary) FROM Employee E group by E.city");
    	List<Integer> sal = query.list();
    	System.out.println(sal);
    	tx.commit();
    	session.close();
		
	}
    public static void empSalGt10000(SessionFactory sessionFactory){
    	Session session = sessionFactory.openSession();
    	Query query = session.createQuery("SELECT E.name FROM Employee E where E.salary>10000");
    	List<String> emps = query.list();
    	System.out.println("Employees having salary greater than 10K: "+emps);
    	session.close();
    }

    public static void getAvgSal(SessionFactory sessionFactory){
    	Session session = sessionFactory.openSession();
    	Query query = session.createQuery("SELECT AVG(salary) FROM Employee");
    	List<Integer> avgSal = query.list();
    	System.out.println("Avg Sal: "+ avgSal);
    	session.close();
    }
	public static void insert(SessionFactory sessionFactory){
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	
    	
    	Employee e1 = new Employee(1,"Basit", 14500, "Srinagar");
//    	String hql = "INSERT INTO Employee(name, salary, city) SELECT name, salary, city FROM Employee e1";
//    	Query query = session.createQuery(hql);
//    	query.executeUpdate();
    	Employee e2 = new Employee(2,"Anusha", 34500, "Pune");
    	Employee e3 = new Employee(3,"BD", 4500, "Bombay");
    	Employee e4 = new Employee(4,"Shruti", 500, "Bangalore");
    	Employee e5 = new Employee(5,"Piyush", 54500, "Pune");
    	
    	session.save(e1);
    	session.save(e2);
    	session.save(e3);
    	session.save(e4);
    	session.save(e5);
    	
    	tx.commit();
    	session.close();
    }
    
    public static void totalSalary(SessionFactory sessionFactory){
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	Query query = session.createQuery("SELECT SUM(salary) FROM Employee");
    	List<Integer> total = query.list();
    	System.out.println("TOTAL:"+total);
    	tx.commit();
    	session.close();
    }
    public static void listEmpBySal(SessionFactory sessionFactory){
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	Query query = session.createQuery("FROM Employee E order by E.salary");
    	List<Employee> empList = query.list();
    	System.out.println("Employees:"+empList);
    	tx.commit();
    	session.close();
    }
}
