package modul_7.praktikum_3.latihan.praktikum;

public class Checkout {
    private PaymentStrategy paymentStrategy;

    // Mengosongkan constructor atau mengizinkan instansiasi awal tanpa strategi
    public Checkout() {}

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Gagal: Silakan pilih metode pembayaran terlebih dahulu!");
            return;
        }
        paymentStrategy.pay(amount);
    }
}