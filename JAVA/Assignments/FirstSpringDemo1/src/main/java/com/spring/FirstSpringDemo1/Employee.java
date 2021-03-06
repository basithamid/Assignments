package com.spring.FirstSpringDemo1;

import javax.security.auth.Destroyable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Employee implements BeanNameAware, BeanPostProcessor, InitializingBean, DisposableBean{
	@Autowired
	@Qualifier("dept")
	Department dept;
	String name;
	public Employee(){
		System.out.println("Employee");
	}
	
	public Employee(Department dept1) {
		super();
		this.dept = dept1;
	}

	public Employee(Department dept, String name) {
		super();
		this.dept = dept;
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("BeanNameAware");
	}

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Before Initialization");
		return null;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("After Initialization");
		return null;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initializing Bean");
	}
	public void myInit(){
		System.out.println("Init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("marjaa");
		
	}
	
}
