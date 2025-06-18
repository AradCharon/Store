package payment;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Payment of %.2f via PayPal account with email %s was processed.\n", amount, email);
    }

    @Override
    public String getPaymentDetails() {
        return String.format("Payment via PayPal - Email: %s", email);
    }
}