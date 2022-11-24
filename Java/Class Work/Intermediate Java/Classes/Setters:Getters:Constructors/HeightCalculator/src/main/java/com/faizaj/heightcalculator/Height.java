/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.heightcalculator;

/**
 *
 * @author faiza
 */
public class Height {

    public int height;
    private int feet;
    private int inches;
    
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFeet() {
        feet = height / 12;
        return feet;
    }

    public int getInches() {
        inches = height%12;
        return inches;
    }



}
