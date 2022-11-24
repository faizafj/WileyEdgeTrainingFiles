/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.reversenumber;

import java.util.*;

public class Reverse {

    public int number;
    private int reverse = 0;


    public void setNumber(int number) {
        this.number = number;
    }

    public int getReverse() {
        while (number != 0) {
            reverse = reverse *10; 
            reverse = reverse + number % 10;
            number = number / 10;
        }
        return reverse;
    }

}
