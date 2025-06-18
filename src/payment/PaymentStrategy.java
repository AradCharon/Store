package payment;

interface PaymentStrategy {
    void pay(double amount);
    String getPaymentDetails();
}
