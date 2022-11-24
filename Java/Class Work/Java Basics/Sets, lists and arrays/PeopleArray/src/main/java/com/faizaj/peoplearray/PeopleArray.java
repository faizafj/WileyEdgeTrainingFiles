/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.faizaj.peoplearray;

import java.util.*;

/**
 *
 * @author faiza
 */
public class PeopleArray {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many people? ");
        int numberOfPeople = Integer.parseInt(userInput.nextLine());
        ListOfPeople listOfPeople = new ListOfPeople(numberOfPeople);

        for (int i = 0; i < numberOfPeople; i++) {


        }

    }
}
