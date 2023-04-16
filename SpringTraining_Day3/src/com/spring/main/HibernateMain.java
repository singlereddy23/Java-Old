package com.spring.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Employee;
import com.spring.dao.EmployeeDao;

public class HibernateMain
{
	public static void main(String[] args)
	{	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springdb.xml");
		EmployeeDao edao = (EmployeeDao) ctx.getBean("emphibernate");
		
		Employee emp = new Employee(7, "Manik","QA");
		edao.save(emp);
		 
		
		List<Employee> emps = edao.getEmps();
		System.out.println("Eid\tName\tRole");
		for(Employee e:emps)
		{	System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getRole());
		}
	}

}
