/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.faizaj.eggstask;

/**
 *
 * @author faiza
 */
public class EggsTask {

    
    private int dozen;
    private int gross;
    private int remainder;
    public int number;

    public int getDozen() {
        dozen = number/12;
        return dozen;
    }

    public int getGross() {
        gross = number / 144;
        return gross;
    }
    
    public int getRemainder() {
        remainder = (number % 144) + (number % 12);
        return remainder;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
    
    
}
