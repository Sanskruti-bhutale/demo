package com.sans.vehicle_service_management_system;

public class Bike extends Vehicle {

    private String bikeType;
    private double baseCost;

    public Bike(String vehicleNumber, String ownerName, String typeVehicle, String bikeType, double baseCost) {
        super(vehicleNumber, ownerName, typeVehicle);
        this.bikeType = bikeType;
        this.baseCost = baseCost;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    @Override
    public double calculateServiceCost() {
        return baseCost + 500;
    }
}

