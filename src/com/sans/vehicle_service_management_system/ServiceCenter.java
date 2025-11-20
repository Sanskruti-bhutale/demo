package com.sans.vehicle_service_management_system;

import java.util.Scanner;

public class ServiceCenter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("-------- VEHICLE SERVICE ---------");

        System.out.print("Enter vehicle type (car/bike) : ");
        String type = scan.nextLine().toLowerCase();

        System.out.print("Enter vehicle number : ");
        String number = scan.nextLine();

        System.out.print("Enter owner name : ");
        String owner = scan.nextLine();

        System.out.print("Enter base service cost : ");
        double baseCost = Double.parseDouble(scan.nextLine());

        Vehicle vehicle = null;

        // ---- POLYMORPHISM ----
        if (type.equals("car")) {
            System.out.print("Enter car type (SUV/Sedan/Hatchback): ");
            String carType = scan.nextLine();

            vehicle = new Car(number, owner, "Car", carType, baseCost);

        } else if (type.equals("bike")) {
            System.out.print("Enter bike type (Sports/Cruiser/Standard): ");
            String bikeType = scan.nextLine();

            vehicle = new Bike(number, owner, "Bike", bikeType, baseCost);

        } else {
            System.out.println("Invalid vehicle type entered!");
            return;
        }

        // ---- SERVICE COST ----
        System.out.println("\n-------------------------------");
        double totalCost = vehicle.calculateServiceCost();
        vehicle.displayDetails();
        System.out.println("Total Service Cost : " + totalCost);
        System.out.println("-------------------------------");

        // ---- PAYMENT ----
        System.out.print("\nChoose payment method (UPI/Card): ");
        String paymentMode = scan.nextLine();

        Payment payment = new OnlinePayment(paymentMode);
        payment.makePayment(totalCost);
        payment.generateReceipt();

        System.out.println("\nThank you for servicing your vehicle with us!");
    }
}


