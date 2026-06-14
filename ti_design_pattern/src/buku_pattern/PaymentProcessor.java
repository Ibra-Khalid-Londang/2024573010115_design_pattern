package buku_pattern;

public interface PaymentProcessor {

    /**
     * Memproses pembayaran sejumlah amount.
     * @param amount Jumlah yang dibayarkan (dalam mata uang lokal)
     */
    void pay(double amount);
}
