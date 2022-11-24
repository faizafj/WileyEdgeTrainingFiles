/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.shapesandperimeters;

/**
 *
 * @author faiza
 */
public class Rectangle extends Shape {
    
    //constructors
    int width = 0;
    int height = 0;

    
    //getters and setters for the width
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        area = width * height;
        perimeter = (2*width) + (2*height);
               
    }

    //getters and setters for the height
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        area = width * height;
        perimeter = (2 * width) + (2 * height);
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
