/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.faizaj.userio;

import java.util.Scanner;

/**
 *
 * @author faiza
 */
public class UserIO implements Interface {

    final private Scanner userInput = new Scanner(System.in); //defined as const

    //constructors?
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        String userString; //init usersString where they input their string 
        System.out.println(prompt); //print the prompt
        userString = userInput.nextLine(); //user string = the input
        return userString; //returned input
    }

    @Override
    public int readInt(String prompt) {
        int number;
        System.out.println(prompt); //prints the prompt
        number = Integer.parseInt(userInput.nextLine()); //turns the input into an integer.
        return number; //returns number
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        int number = 0;
        boolean flag = true;
        while (flag) {
            System.out.println(prompt);
            number = Integer.parseInt(userInput.nextLine());
            if (number > min && number < max) {
                flag = false;
            } else {
                flag = true;
            }
        }

        return (number);

    }

    @Override
    public double readDouble(String prompt) {
        double number;
        System.out.println(prompt); //prints the prompt
        number = Double.parseDouble(userInput.nextLine()); //turns the input into a double.
        return number; //returns number        
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double number = 0;
        boolean flag = true;
        while (flag) {
            System.out.println(prompt);
            number = Double.parseDouble(userInput.nextLine());
            if (number > min && number < max) {
                System.out.println("Congrats! " + number + " is in the range of " + min + " and " + max);
                flag = false;
            } else {
                System.out.println("Try again");
            }
        }
        return (number);
    }

    @Override
    public float readFloat(String prompt) {
        float number;
        System.out.println(prompt); //prints the prompt
        number = Float.parseFloat(userInput.nextLine()); //turns the input into a float.
        return number; //returns number        
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float number = 0;
        boolean flag = true;
        while (flag) {
            System.out.println(prompt);
            number = Float.parseFloat(userInput.nextLine());
            if (number > min && number < max) {
                System.out.println("Congrats! " + number + " is in the range of " + min + " and " + max);
                flag = false;
            } else {
                System.out.println("Try again");
            }
        }

        return (number);
    }

    @Override
    public long readLong(String prompt) {
        long number;
        System.out.println(prompt); //prints the prompt
        number = Long.parseLong(userInput.nextLine()); //turns the input into long.
        return number; //returns number      
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long number = 0;
        boolean flag = true;
        while (flag) {
            System.out.println(prompt);
            number = Long.parseLong(userInput.nextLine());
            if (number > min && number < max) {
                System.out.println("Congrats! " + number + " is in the range of " + min + " and " + max);
                flag = false;
            } else {
                System.out.println("Try again");
            }
        }

        return (number);

    }
}
