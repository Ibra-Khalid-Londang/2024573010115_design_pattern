package buku_pattern;

public class PayPalAdapter implements PaymentProcessor {

    private final PayPalService payPalService;
    private final String merchantRecipient = "merchant@shopnow.com";

    public PayPalAdapter(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void pay(double amount) {
        // Menerjemahkan: pay(amount) → sendMoney(recipient, value, currency)
        // Detail teknis PayPal seperti recipient dan currency tersembunyi di sini
        payPalService.sendMoney(merchantRecipient, amount, "USD");
    }
}
