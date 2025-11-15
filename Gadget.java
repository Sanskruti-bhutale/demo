package com.sans.gadget_inventory_system;


public class Gadget {

    private String brand;
    private double price;
    private static String storeName = "TechNova Electronics";

    static {
        System.out.println("Welcome to "+storeName+" Inventory!");
    }

    {
        System.out.println("New Gadget record being created...");
    }

    public Gadget(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Getters and Setters (Encapsulation)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static void changeStoreName(String newName) {
        storeName = newName;
    }

    public void showGadgetInfo() {
        System.out.println("--- Gadget Details ---");
        System.out.println("Brand: " + brand + ", Price: " + price + ", Store: " + storeName);
    }
}




