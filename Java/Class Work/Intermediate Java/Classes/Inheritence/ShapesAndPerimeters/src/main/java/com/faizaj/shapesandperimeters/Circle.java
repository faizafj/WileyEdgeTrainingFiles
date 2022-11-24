/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.shapesandperimeters;

/**
 *
 * @author faiza
 */
public class Circle extends Shape {
    
    int radius = 0;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        area = (int) (Math.PI * radius * radius);
        perimeter = (int) (2 * Math.PI * radius);
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
