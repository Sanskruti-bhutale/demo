package com.sans.gadget_inventory_system;

public class InventoryMain {
    public static void main(String[] args) {

        Mobile m1 = new Mobile("Samsung", 45000, "8GB");
        Mobile m2 = new Mobile("Apple", 90000, "6GB");

        Gadget.changeStoreName("SunShine Store");

        m1.showGadgetInfo();
        m2.showGadgetInfo();

        m1.applyOffer(10);
        m2.applyOffer(20);

        Laptop l1 = new Laptop("Dell", 75000, "Intel i9");
        Laptop l2 = new Laptop("HP", 60000, "AMD Ryzen 9");

        l1.showGadgetInfo();
        l2.showGadgetInfo();

        Laptop.comparePrice(l1, l2);
    }
}
