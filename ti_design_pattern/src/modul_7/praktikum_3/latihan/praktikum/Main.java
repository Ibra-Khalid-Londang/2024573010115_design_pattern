package modul_7.praktikum_3.latihan.praktikum;

public class Main {
    public static void main(String[] args) {
        Checkout cart = new Checkout();
        double totalBelanja = 150000.0;

        System.out.println("--- Simulasi Checkout E-Commerce ---\n");

        // 1. Pengujian Kartu Kredit
        System.out.println("[User memilih Kartu Kredit]");
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.processPayment(totalBelanja);

        System.out.println();

        // 2. Pengujian E-Wallet
        System.out.println("[User mengubah metode ke E-Wallet]");
        cart.setPaymentStrategy(new EWalletPayment());
        cart.processPayment(totalBelanja);

        System.out.println();

        // 3. Pengujian Transfer Bank
        System.out.println("[User mengubah metode ke Transfer Bank]");
        cart.setPaymentStrategy(new BankTransferPayment());
        cart.processPayment(totalBelanja);
    }
}