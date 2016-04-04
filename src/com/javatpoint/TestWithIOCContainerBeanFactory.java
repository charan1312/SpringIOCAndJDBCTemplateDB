package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class TestWithIOCContainerBeanFactory {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        
        BeanFactory factory = new XmlBeanFactory(resource);
        
        Student s1 = (Student) factory.getBean("stubean");
        
        s1.displayInfo();
        s1.setName("Aware Charan");
        s1.displayInfo();
        
        Student s2 = (Student) factory.getBean("stubean");
        s2.setName("Other Student");
        s2.displayInfo();
    }
}
