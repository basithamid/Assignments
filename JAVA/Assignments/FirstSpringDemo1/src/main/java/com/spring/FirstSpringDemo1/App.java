package com.spring.FirstSpringDemo1;

import java.util.HashMap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("Beans_simple.xml");
//        HashMap <String,OrderBean> orders = (HashMap<String, OrderBean>) iocContainer.getBeansOfType(OrderBean.class);
//        int total=0;
//        for(OrderBean item:orders.values()){
//        	total+=item.getItem().getPrice();
//        }
//        System.out.println("Total price:"+total);
    	
    	Employee emp = (Employee) iocContainer.getBean("employee1");
    	System.out.println("Name: "+emp.getName()+"\tAddress: "+emp.getDept().getName());
    	iocContainer.close();
    }
}
