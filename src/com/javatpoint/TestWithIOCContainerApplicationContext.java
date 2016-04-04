package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestWithIOCContainerApplicationContext {

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Student s1 = (Student) context.getBean("stubean");
        
        s1.displayInfo();
        s1.setName("Aware Charan");
        s1.displayInfo();
        
        Student s2 = (Student) context.getBean("stubean");
        s2.setName("Other Student");
        s2.displayInfo();
    }
}
