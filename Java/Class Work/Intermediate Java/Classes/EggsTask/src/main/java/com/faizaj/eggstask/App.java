/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.eggstask;

import java.util.*;

/**
 *
 * @author faiza
 */
public class App {

    public static void main(String[] args) {
        EggsTask eggs = new EggsTask();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = Integer.parseInt(userInput.nextLine());

        eggs.setNumber(number);
        System.out.println("You have " + eggs.getDozen() + " dozens");
        System.out.println("You have " + eggs.getGross() + " gross");
        System.out.println("You have " + eggs.getRemainder() + " remaining eggs");

    }
}
