package buku_pattern;

public class StripeAdapter implements PaymentProcessor {

    // Menyimpan referensi ke Adaptee (Object Adapter — composition)
    private final StripeService stripeService;

    public StripeAdapter(StripeService stripeService) {
        this.stripeService = stripeService;
    }

    @Override
    public void pay(double amount) {
        // Menerjemahkan: pay(amount) → makePayment(amount, "IDR")
        // Logika translasi parameter terisolasi di sini, tidak mencemari klien
        stripeService.makePayment(amount, "IDR");
    }
}
