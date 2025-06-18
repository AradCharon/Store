import payment.*;

public class Main {
    public static void main(String[] args) {
        Customer regularCustomer = new RegularCustomer("Ali Piri");
        Customer premiumCustomer1 = new PremiumCustomer("Arad Shafiee");
        Customer premiumCustomer2 = new PremiumCustomer("Ali Logic");

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "Ali Piri");
        PaymentStrategy paypal = new PayPalPayment("aradshafiee06@gmail.com");
        PaymentStrategy bitcoin = new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");

        regularCustomer.displayCustomerInfo();
        premiumCustomer1.displayCustomerInfo();
        premiumCustomer2.displayCustomerInfo();

        regularCustomer.makePayment(creditCard, 150000);
        regularCustomer.makePayment(paypal, 75000);

        premiumCustomer1.makePayment(bitcoin, 200000);
        premiumCustomer1.makePayment(creditCard, 120000);

        premiumCustomer2.makePayment(paypal, 180000);
        premiumCustomer2.makePayment(bitcoin, 95000);

        regularCustomer.showPaymentHistory();
        premiumCustomer1.showPaymentHistory();
        premiumCustomer2.showPaymentHistory();
    }
}