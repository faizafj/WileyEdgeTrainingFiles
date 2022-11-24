/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author faiza
 */
public class App {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Which operation would you like to use? Or would you like to exit?");
            String userOptions = userInput.nextLine();

            if (userOptions.contains("exit")) {
                System.out.println("Goodbye");
                //add exit;
            } else {

                System.out.println("Please enter your first number");
                int userNumberOne = Integer.parseInt(userInput.nextLine());

                System.out.println("Please enter your second number");
                int userNumberTwo = Integer.parseInt(userInput.nextLine());

                SimpleCalculator calculation = new SimpleCalculator(userNumberOne, userNumberTwo);

                if (userOptions.contains("addition")) {
                    System.out.println (calculation.addition());

                } else if (userOptions.contains("subtraction")) {
                    System.out.println(calculation.subtraction());

                } else if (userOptions.contains("multiplication")) {
                    System.out.println(calculation.multiplication());

                } else if (userOptions.contains("division")) {
                    System.out.println(calculation.division());

                } else {
                    System.out.println("Invalid answer");
                }
                System.out.println("Would you like to do another calculation? Or would you like to exit?");
                String userOptions2 = userInput.nextLine();

                if (userOptions2.contains("no")) {
                    flag = false;
                }

            }
        }

    }
}
