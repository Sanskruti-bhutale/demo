package com.sans.vehicle_service_management_system;



public class OnlinePayment implements Payment {
    
    private String paymentMode;   // UPI / Card / NetBanking
    private double amountPaid;
    private String transactionId;

    // Constructor taking only payment mode
    public OnlinePayment(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    @Override
    public void makePayment(double amount) {
        this.amountPaid = amount;

        // Generate transaction ID inside payment logic
        this.transactionId = "TXN" + System.currentTimeMillis();

        System.out.println("Processing payment using " + paymentMode + "...");
        System.out.println("Payment Successful!");
    }

    @Override
    public void generateReceipt() {
        System.out.println("\n---------- PAYMENT RECEIPT ----------");
        System.out.println("Payment Mode   : " + paymentMode);
        System.out.println("Amount Paid    : " + amountPaid);
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("-------------------------------------");
    }

    // GETTERS (optional if you need elsewhere)
    public String getPaymentMode() {
        return paymentMode;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public String getTransactionId() {
        return transactionId;
    }

}

