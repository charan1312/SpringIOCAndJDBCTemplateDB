package com.javatpoint.database.related;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDaoTestWithPrepStmt {

    public static void main(String[] args) {  
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextForDBRelated.xml");  

        EmployeeDaoWithPrepStmt dao=(EmployeeDaoWithPrepStmt)ctx.getBean("edaowithPrepStmt");  
        boolean status=dao.saveEmployeeByPrepStmt(new Employee(101,"Aware Charan",95000));  
        System.out.println(status);  

        /*int status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
        System.out.println(status); 
         */  

        /*Employee e=new Employee(); 
        e.setId(102); 
        int status=dao.deleteEmployee(e); 
        System.out.println(status);*/  

    }  
}
