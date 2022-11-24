/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.vehicles;

/**
 *
 * @author faiza
 */
public class VehicleDetails {

    public int numberOfSeats;
    public String color;
    public String brandName;
    public String model;
    public int numberOfDoors;

    public VehicleDetails(int numberOfSeats, String color, String brandName, String model, int numberOfDoors) {
        this.numberOfSeats = numberOfSeats;
        this.color = color;
        this.brandName = brandName;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void displayVehicle() {
        System.out.println("No of seats: " + numberOfSeats);
        System.out.println("No of doors: " + numberOfDoors);
        System.out.println("Car Model: " + model);
        System.out.println("Brand: " + brandName);
        System.out.println("Color" + color);

    }

}
