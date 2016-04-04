package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DepenInjecThruConsForObject {

    public static void main(String[] args) {  
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        EmployeeWithAddress s=(EmployeeWithAddress)factory.getBean("empwithaddbean");  
        s.show();  
        s.getAddress().setCity("Tempe");
        s.setName("CAT");
        s.show();  
          
    } 
}
