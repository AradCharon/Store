package payment;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Payment of %.2f with credit card number %s under name %s was processed.\n",
                amount, cardNumber, cardHolderName);
    }

    @Override
    public String getPaymentDetails() {
        return "Payment with credit card - Card number: " + cardNumber +
                " - Cardholder name: " + cardHolderName;
    }
}