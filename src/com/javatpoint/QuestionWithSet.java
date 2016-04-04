package com.javatpoint;  

import java.util.Iterator;  
import java.util.List;  
import java.util.Set;

public class QuestionWithSet {  
    private int id;  
    private String name;  
    private Set<String> answers;  

    public QuestionWithSet() {}  
    public QuestionWithSet(int id, String name, Set<String> answers) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.answers = answers;  
    }  

    public void displayInfo(){  
        System.out.println(id+" "+name);  
        System.out.println("answers are:");  
        Iterator<String> itr=answers.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
    }  

} 