/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.faizaj.employeeclassthings;

import java.util.*;

/**
 *
 * @author faiza
 */
public class EmployeeClassThings {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter employee name");
        String employeeName = userInput.nextLine();
        
        System.out.println("Please enter employee age");
        int employeeAge = userInput.nextInt();

    }
}
