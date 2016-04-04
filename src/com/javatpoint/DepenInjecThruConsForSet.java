package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DepenInjecThruConsForSet {

    public static void main(String[] args) {  
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        try{
            QuestionWithSet s=(QuestionWithSet)factory.getBean("questionsetbean");  
            s.displayInfo();
            
        } catch(NoSuchBeanDefinitionException e) {
            System.out.println("Mentioned Bean is not defined");
        }
  
          
    } 
}
