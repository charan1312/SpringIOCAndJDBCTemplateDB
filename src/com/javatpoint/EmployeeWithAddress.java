package com.javatpoint;

public class EmployeeWithAddress {

    private int id;  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private String name; 
    private Address address;

    public EmployeeWithAddress() {
        System.out.println("def cons");
    }  

    public EmployeeWithAddress(int id) {
        this.id = id;
    }  

    public EmployeeWithAddress(String name) { 
        this.name = name;
    }  
    
    public EmployeeWithAddress(Address address) { 
        this.address = address;
    }

    public EmployeeWithAddress(int id, String name,Address address) {  
        this.id = id;  
        this.name = name;  
        this.address = address;
    }  

    void show(){  
        System.out.println(id+" "+name +" "+ address);  
    }  

    
}
