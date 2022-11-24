/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faizaj.vehicles;

/**
 *
 * @author faiza
 */
public class Cars extends VehicleDetails {

    String carType;
    String carFeatures;
    double topSpeed;

    public Cars(String carType, String carFeatures, double topSpeed, int numberOfSeats, String color, String brandName, String model, int numberOfDoors) {
        super(numberOfSeats, color, brandName, model, numberOfDoors);
        this.carType = carType;
        this.carFeatures = carFeatures;
        this.topSpeed = topSpeed;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarFeatures() {
        return carFeatures;
    }

    public void setCarFeatures(String carFeatures) {
        this.carFeatures = carFeatures;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getBrandName() {
        return brandName;
    }

    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}
