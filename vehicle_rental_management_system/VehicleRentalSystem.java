package com.sans.vehicle_rental_management_system;

public class VehicleRentalSystem {
    public static void main(String[] args) {

        // Creating a Customer
        Customer customer = new Customer("C101", "Sanskruti", "9876543210");

        // Customer chooses a vehicle
        Rentable vehicle = new Car("V001", "Toyota", "Fortuner", "Diesel", 7);
        // If Bike: 
        // Rentable vehicle = new Bike("B001", "Yamaha", "R15", 155);

        // Rental info
        Rental rental = new Rental("R501", customer, vehicle, 3);

        // Print Invoice
        rental.printInvoice();
    }
}
