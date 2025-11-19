package com.sans.gadget_inventory_system;



public class Mobile extends Gadget {
    private String ramSize;

    public Mobile(String brand, double price, String ramSize) {
        super(brand, price);
        this.ramSize = ramSize;
    }

    @Override
    public void showGadgetInfo() {
        System.out.println("--- Gadget Details ---");
        System.out.println("Mobile: Brand = " + getBrand() +
                ", Price = " + getPrice() +
                ", RAM = " + ramSize +
                ", Store = " + Gadget.getStoreName());
    }

    public void applyOffer(double percent) {
        double newPrice = getPrice() - (getPrice() * percent / 100);
        setPrice(newPrice);
        System.out.println("Offer applied! New price after " + percent + "% off: " + newPrice);
    }
}

