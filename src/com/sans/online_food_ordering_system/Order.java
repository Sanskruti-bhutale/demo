package com.sans.online_food_ordering_system;

public class Order {
	private FoodItem [] items=new FoodItem[5];
	int index=0;
	Customer customer;
	
	public void addItem(FoodItem item) {
		if(index < items.length) {
            items[index++] = item;
        } else {
            System.out.println("Order is full! Cannot add more items.");
        }
	}
	public double calculateTotal() {
		double total=0;
	
		for(int i=0;i<=index;i++) {
			if(items[i]!=null)
			total+=items[i].getPrice();
		}
		return total;
		
	}
	public void setCustomer(Customer c) {
		this.customer=c;
	}
	public Customer getCustomer() {
		return customer;
	}
	 public void printSummary() {
	        System.out.println("\n---------- ORDER SUMMARY ----------");
	        System.out.println("Customer Name : " + customer.getName());
	        System.out.println("Phone Number  : " + customer.getPhone());
	        System.out.println("\nItems Ordered:");

	        for(int i = 0; i < index; i++) {
	            System.out.println((i+1) + ". " + items[i].getName() + "  ₹" + items[i].getPrice());
	        }

	        System.out.println("\n-----------------------------------");
	        System.out.println("Total Amount Payable : ₹" + calculateTotal());
	        System.out.println("-----------------------------------");
	    }
	

}
