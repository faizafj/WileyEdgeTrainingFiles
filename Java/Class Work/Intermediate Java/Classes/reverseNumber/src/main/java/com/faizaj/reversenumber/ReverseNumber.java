/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.faizaj.reversenumber;

import java.util.*;

/**
 *
 * @author faiza
 */
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter a number ");
        int userNumber = Integer.parseInt(userInput.nextLine());
        
        Reverse reverseTheNumber = new Reverse();

        reverseTheNumber.setNumber(userNumber);
        System.out.println(reverseTheNumber.getReverse());

    }
}
