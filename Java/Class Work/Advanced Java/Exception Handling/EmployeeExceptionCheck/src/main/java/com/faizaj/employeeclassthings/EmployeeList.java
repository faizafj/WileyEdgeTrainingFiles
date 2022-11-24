/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.employeeclassthings;

/**
 *
 * @author faiza
 */
public class EmployeeList extends Employee {
    
    
    private Employee[] employeeList;
    private int numberOfEmployees;


    public EmployeeList(Employee[] employeeList, int numberOfEmployees, String employeeName, int age) {
        super(employeeName, age);
        this.employeeList = employeeList;
        this.numberOfEmployees = numberOfEmployees;
    }

    public Employee[] getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Employee[] employeeList) {
        this.employeeList = employeeList;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    

    
    
}
