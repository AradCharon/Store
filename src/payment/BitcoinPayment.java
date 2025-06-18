package payment;

public class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Payment of %.2f with Bitcoin to wallet address %s was completed.\n",
                amount, walletAddress);
    }

    @Override
    public String getPaymentDetails() {
        return "Payment with Bitcoin - Wallet address: " + walletAddress;
    }
}
