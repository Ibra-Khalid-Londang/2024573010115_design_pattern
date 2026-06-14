package buku_pattern;

public class StripeService {
    public void makePayment(double amount, String currency) {
        System.out.println("[Stripe] Memproses pembayaran: " + amount + " " + currency);
    }
}

// ─── PayPalService.java ───────────────────────────────────────────
// Kelas eksternal PayPal — TIDAK BISA DIMODIFIKASI
class PayPalService {
    public void sendMoney(String recipient, double value, String currency) {
        System.out.println("[PayPal] Mengirim " + value + " " + currency
                + " ke " + recipient);
    }
}

// ─── GopayService.java ───────────────────────────────────────────
// Kelas eksternal GoPay — TIDAK BISA DIMODIFIKASI
// Perhatikan: GoPay menerima amount dalam SEN (cents), bukan rupiah
class GopayService {
    public void initiateTransaction(long amountInCents, String referenceId) {
        System.out.println("[GoPay] Inisiasi transaksi: " + amountInCents
                + " sen, ref: " + referenceId);
    }
}