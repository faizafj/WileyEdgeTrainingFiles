/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.shapesandperimeters;

/**
 *
 * @author faiza
 */
public class Square extends Shape { //inehriting from Shape so we have access to all methods and variables 

    int side = 0;

    public void setSide(int sideLength) {

        side = sideLength;
        area = side*side;
        perimeter = 4 * side;

    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getPerimeter() {
        return perimeter;
    }

}
