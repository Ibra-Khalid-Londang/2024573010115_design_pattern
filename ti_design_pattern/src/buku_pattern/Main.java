package buku_pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   ShopNow Payment System — Demo Adapter  ");
        System.out.println("==========================================");

        // ── 1. Inisialisasi Adaptee (library pihak ketiga) ───────
        StripeService  stripeAPI  = new StripeService();
        PayPalService  paypalAPI  = new PayPalService();
        GopayService   gopayAPI   = new GopayService();

        // ── 2. Bungkus setiap Adaptee dalam Adapter-nya ──────────
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeAPI);
        PaymentProcessor paypalAdapter = new PayPalAdapter(paypalAPI);
        PaymentProcessor gopayAdapter  = new GopayAdapter(gopayAPI, "ORD-2024-003");

        // ── 3. CheckoutSystem hanya tahu PaymentProcessor ────────
        CheckoutSystem checkout = new CheckoutSystem(stripeAdapter);

        // Skenario 1: Bayar via Stripe
        System.out.println("\n--- Skenario 1: Pembayaran via Stripe ---");
        checkout.processOrder(250000.0);

        // Skenario 2: Ganti ke PayPal — cukup setPaymentProcessor()
        System.out.println("\n--- Skenario 2: Ganti ke PayPal --------");
        checkout.setPaymentProcessor(paypalAdapter);
        checkout.processOrder(19.99);

        // Skenario 3: Ganti ke GoPay
        System.out.println("\n--- Skenario 3: Ganti ke GoPay ---------");
        checkout.setPaymentProcessor(gopayAdapter);
        checkout.processOrder(150000.0);

        // ── 4. Menambah provider BARU tidak mengubah CheckoutSystem ──
        // Cukup buat OvoAdapter implements PaymentProcessor, lalu inject.
        System.out.println("\n[DEMO] Tambah OVO: buat OvoAdapter, inject ke checkout.");
        System.out.println("       CheckoutSystem tidak perlu diubah sama sekali.");

        System.out.println("\n==========================================");
    }
}
