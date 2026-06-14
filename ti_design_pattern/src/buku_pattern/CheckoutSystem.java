package buku_pattern;

public class CheckoutSystem {

    // Bergantung pada ABSTRAKSI, bukan pada implementasi konkret
    private PaymentProcessor paymentProcessor;

    // Dependency injection — processor dimasukkan dari luar
    public CheckoutSystem(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(double amount) {
        System.out.println("[CheckoutSystem] Memulai proses checkout...");
        paymentProcessor.pay(amount);  // Pemanggilan standar via interface
        System.out.println("[CheckoutSystem] Proses checkout selesai.");
    }

    // Mengganti provider semudah mengganti referensi — tanpa ubah logika
    public void setPaymentProcessor(PaymentProcessor processor) {
        this.paymentProcessor = processor;
    }
}
