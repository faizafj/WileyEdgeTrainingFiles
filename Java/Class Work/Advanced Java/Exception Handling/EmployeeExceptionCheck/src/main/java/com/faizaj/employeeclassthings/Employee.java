/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.employeeclassthings;

/**
 *
 * @author faiza
 */
public class Employee {
    
    
    public String employeeName;
    public int age;

    public Employee(String employeeName, int age) {
        this.employeeName = employeeName;
        this.age = age;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void checkAge(int age){
        if (age < 18|| age > 60){
            throw new AgeCheckException("Employee age MUST be between 18 and 60 years");
        }
    }
    
}
