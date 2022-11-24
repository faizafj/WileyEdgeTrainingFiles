/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.faizaj.heightcalculator;

/**
 *
 * @author faiza
 */
public class HeightCalculator {

    public static void main(String[] args) {

        Height heightCalculator = new Height();
        heightCalculator.setHeight(139); 
        
        Height heightCalculator2 = new Height ();
        heightCalculator2.setHeight(129);
        

        String sum = heightCalculator.getFeet() + " feet " + heightCalculator.getInches() + " inches";
        System.out.println("Total Height of person one: " + sum);

        String sum2 = heightCalculator2.getFeet() + " feet " + heightCalculator2.getInches() + " inches";
        System.out.println("Total Height of person two: " + sum2);
       
        int totalFeet = heightCalculator.getFeet()  + heightCalculator2.getFeet();
        int totalInches = heightCalculator.getInches()  + heightCalculator2.getInches();
        System.out.println(totalInches);
        
        if (totalInches > 12){
            totalFeet = totalFeet + (totalInches / 12);
            totalInches = totalInches + (totalInches % 12);
        }

        System.out.println("Total Height: " + totalFeet + " Feet" + totalInches + "inches");
        

    }
}
