package modul_5.praktikum_1.dengan_ocp;

public class PaymentProcessor {
    public void processorPayment(PaymentMethod method, double amount) {
        method.process(amount);
    }
}
