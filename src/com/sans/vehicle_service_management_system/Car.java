package com.sans.vehicle_service_management_system;

public class Car extends Vehicle  {

    private String carType;
    private double baseCost;

    public Car(String vehicleNumber, String ownerName, String typeVehicle, String carType, double baseCost) {
        super(vehicleNumber, ownerName, typeVehicle);
        this.carType = carType;
        this.baseCost = baseCost;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    @Override
    public double calculateServiceCost() {
        double car_service_cost = baseCost + 1000;
        return car_service_cost;
    }
}

