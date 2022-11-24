/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.shapesandperimeters;

/**
 *
 * @author faiza
 */
public class Triangle extends Shape {
    
    int height = 0;
    int base = 0;
    int side1 = 0;
    int side2 = 0;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        area = (base * height) / 2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
        area = (base * height) / 2;
        perimeter = base + side1 + side2; 
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
        perimeter = base + side1 + side2; 
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
        perimeter = base + side1 + side2; 
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
