package com.javatpoint;  

import java.util.Iterator;  
import java.util.List;  
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionWithMap {  
    private int id;  
    private String name;  
    private Map<String,String> answers;  

    public QuestionWithMap() {}  
    public QuestionWithMap(int id, String name, Map<String,String> answers) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.answers = answers;  
    }  

    public void displayInfo(){  
        System.out.println(id+" "+name);  
        System.out.println("answers are:");  
        
        Set<Entry<String, String>> entry = answers.entrySet();

        Iterator<Entry<String, String>> itr = entry.iterator();
        while(itr.hasNext()) {
            Entry<String, String> e = itr.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }  

} 