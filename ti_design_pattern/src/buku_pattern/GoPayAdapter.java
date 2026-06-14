package buku_pattern;

class GopayAdapter implements PaymentProcessor {

    private final GopayService gopayService;
    private final String orderId;  // GoPay membutuhkan referenceId

    public GopayAdapter(GopayService gopayService, String orderId) {
        this.gopayService = gopayService;
        this.orderId = orderId;
    }

    @Override
    public void pay(double amount) {
        // Menerjemahkan: pay(amount rupiah) → initiateTransaction(sen, refId)
        // Konversi Rupiah → sen dilakukan di sini, bukan di CheckoutSystem
        long amountInCents = (long)(amount * 100);
        gopayService.initiateTransaction(amountInCents, orderId);
    }
}
