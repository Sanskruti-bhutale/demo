package com.sans.oop_practice;

public class Customer {
		private int customerId;
		private String name;
		private long mobileNumber;
		
		public Customer(int customerId,String name,long mobileNumber) {
			this.customerId=customerId;
			this.name=name;
			this.mobileNumber=mobileNumber;
		}
		public void setCustomerId(int customerId){
			this.customerId=customerId;
			
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setMobileNumber(long mobileNumber) {
			this.mobileNumber=mobileNumber;
		}
		public long getMobileNumber() {
			return this.mobileNumber;
		}
		
	public void displayCustomerInformation() {
	
		System.out.println("Customer id :: "+getCustomerId());
		System.out.println("Customer name :: "+getName());
		System.out.println("Customer mobile number :: "+getMobileNumber());
	}
}
