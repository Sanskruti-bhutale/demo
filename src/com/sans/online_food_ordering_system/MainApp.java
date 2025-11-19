package com.sans.online_food_ordering_system;


import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("\t Welcome to Online Food App ");
        System.out.println("----------------------------------");
        System.out.println();

        // Create Objects
        Customer customer = new Customer();
        Order order = new Order();

        // Take Customer Details
        System.out.print("Enter Customer Name : ");
        customer.setName(scanner.nextLine());

        System.out.print("Enter Mobile Number : ");
        customer.setPhone(scanner.nextLine());

        order.setCustomer(customer);
        System.out.println();

        // Menu Loop
        String more;
        for (int i = 0; i < 5; i++) {

            System.out.println("------------MENU-------------");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");
            System.out.println("3. Beverage");
            System.out.println("--------------------------------");
            System.out.print("Enter your choice : ");

            int choice = Integer.parseInt(scanner.nextLine());
            FoodItem f = null;

            // Create item based on choice
            if (choice == 1) {
                f = new Pizza("Pizza", 250);
            } else if (choice == 2) {
                f = new Burger("Burger", 180);
            } else if (choice == 3) {
                f = new Beverage("Beverage", 80);
            } else {
                System.out.println("Enter valid choice!");
                continue;
            }

            // Add item to order
            order.addItem(f);

            // Ask user to continue
            System.out.print("Do you want to add more items? (y/n): ");
            more = scanner.nextLine();

            if (more.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Print Summary
        System.out.println("\n----------- ORDER SUMMARY ------------");
        customer.CustomerDetails();
        System.out.println();
        System.out.println("Items Ordered:");
        order.printSummary();

        System.out.println();
        System.out.println("Thank you for ordering! Have a nice day 😊");
    }
}



