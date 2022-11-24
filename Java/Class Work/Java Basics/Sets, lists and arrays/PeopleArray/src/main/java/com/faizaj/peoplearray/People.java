/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.peoplearray;

/**
 *
 * @author faiza
 */
public class People {
    
    public int id;
    public String name;
    public int age;
    

    public People(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    
    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    
 
    
    

}
