package com.sans.vehicle_service_management_system;

public abstract class Vehicle {

    private String vehicleNumber;
    private String ownerName;
    private String typeVehicle; // Car / Bike

    public Vehicle(String vehicleNumber, String ownerName, String typeVehicle) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.typeVehicle = typeVehicle;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    // ---- ABSTRACT METHOD ----
    public abstract double calculateServiceCost();

    // ---- COMMON DISPLAY METHOD ----
    public void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + typeVehicle);
    }
}
