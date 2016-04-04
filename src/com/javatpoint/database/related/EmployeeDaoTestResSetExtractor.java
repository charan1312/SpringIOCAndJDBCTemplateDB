package com.javatpoint.database.related;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDaoTestResSetExtractor {

    public static void main(String[] args) {  
        
        List<Employee> emplist;
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextForDBRelated.xml");  

        EmployeeDaoResSetExtractor dao=(EmployeeDaoResSetExtractor)ctx.getBean("edaoResSetExtractor");  

        emplist = dao.getEmployeeListByRSExtractor();
        for(Employee e: emplist) {
            System.out.println(e);
        }
        /*int status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
        System.out.println(status); 
         */  

        /*Employee e=new Employee(); 
        e.setId(102); 
        int status=dao.deleteEmployee(e); 
        System.out.println(status);*/  

    }  
}
