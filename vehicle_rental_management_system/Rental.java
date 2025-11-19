package com.sans.vehicle_rental_management_system;


import java.util.concurrent.CancellationException;

class Rental {
    private String rentalId;
    private Customer customer;
    private Rentable vehicle; // polymorphism
    private int rentalDays;

    public Rental(String rentalId, Customer customer, Rentable vehicle, int rentalDays) {
        this.rentalId = rentalId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    public void printInvoice() {
        System.out.println("\n========= RENTAL INVOICE =========");

        customer.showCustomerInfo();

        System.out.println("\nVehicle Type: " + vehicle.getClass().getSimpleName());
        vehicle.showRentalDetails();

        double totalRent = vehicle.calculateRent(rentalDays);
        System.out.println("\nTotal Rent for " + rentalDays + " days: ₹" + totalRent);

        System.out.println("===================================");
    }
}
