package com.sans.gadget_inventory_system;


public class Laptop extends Gadget {
    private String processor;

    public Laptop(String brand, double price, String processor) {
        super(brand, price);
        this.processor = processor;
    }

    @Override
    public void showGadgetInfo() {
        System.out.println("--- Gadget Details ---");
        System.out.println("Laptop: Brand = " + getBrand() +
                ", Price = " + getPrice() +
                ", Processor = " + processor +
                ", Store = " + Gadget.getStoreName());
    }

    public static void comparePrice(Laptop l1, Laptop l2) {
        if (l1.getPrice() > l2.getPrice()) {
            System.out.println(l1.getBrand() + " (" + l1.getPrice() + ") is more expensive than " +
                               l2.getBrand() + " (" + l2.getPrice() + ")");
        } else if (l2.getPrice() > l1.getPrice()) {
            System.out.println(l2.getBrand() + " (" + l2.getPrice() + ") is more expensive than " +
                               l1.getBrand() + " (" + l1.getPrice() + ")");
        } else {
            System.out.println("Both laptops have the same price!");
        }
    }
}

