package com.sans.vehicle_rental_management_system;




class Car extends Vehicle implements Rentable {
    private String fuelType;
    private int seatingCapacity;

    public Car(String vehicleId, String brand, String model, String fuelType, int seatingCapacity) {
        super(vehicleId, brand, model);
        this.fuelType = fuelType;
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public double calculateRent(int days) {
        return days * 1500; // Example: ₹1500 per day
    }

    @Override
    public void showRentalDetails() {
        System.out.println("---- Car Rental Details ----");
        showBasicInfo();
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }

    @Override
    public String getType() {
        return "Car";
    }
}
