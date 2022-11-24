/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.faizaj.simplecalculator;

/**
 *
 * @author faiza
 */
public class SimpleCalculator {

    private int numberOne;
    private int numberTwo;

    public SimpleCalculator(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int addition() {
        int result = numberOne + numberTwo;
        System.out.print(numberOne + " + " + numberTwo + " = ");
        return (result);
    }
    
    public int subtraction () {
        int result = numberOne - numberTwo;
        System.out.print(numberOne + " - " + numberTwo + " = ");
        return (result);
    }
    
    public int division () {
        int result = numberOne / numberTwo;
        System.out.print(numberOne + " / " + numberTwo + " = ");
        return (result);
    }
    
    
    public int multiplication () {
        int result = numberOne *  numberTwo;
        System.out.print(numberOne + " * " + numberTwo + " = ");
        return (result);
    }
}
