/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.shapesandperimeters;

public abstract class Shape {
    
    int area; //read only variables declared here.
    int perimeter; 
    
    //method signatures
    public abstract int getArea();
    public abstract int getPerimeter(); //only returns the perimeter or area so doesn't require parameters.
    
    
}
