package com.sans.simple_shopping_cart_syatem;

class ShoppingCart {

    Product[] items = new Product[10];  // Array only
    int count = 0;

    static int totalCartsCreated; // static variable
    // Static block
    static {
        System.out.println("ShoppingCart class loaded!");
        totalCartsCreated = 0;
    }
    {
        totalCartsCreated++;
    }
    // Constructor
    ShoppingCart() {
        System.out.println("New Cart Created!");
    }
    void addProduct(Product p) {
        items[count++] = p;
    }

    void addProduct(Product p, double discountPercent) {
        if (p instanceof Discountable) {
            ((Discountable) p).applyDiscount(discountPercent);
        }
        items[count++] = p;
    }
    void showCart() {
        System.out.println("\n===== CART ITEMS =====");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ") " + items[i].name + " - " + items[i].price + " (" + items[i].getCategory() + ")");
        }
    }
    double calculateTotal() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += items[i].price;
        }
        return sum;
    }
}