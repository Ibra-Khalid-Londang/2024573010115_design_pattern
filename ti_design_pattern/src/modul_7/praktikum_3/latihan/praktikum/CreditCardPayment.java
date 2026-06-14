package modul_7.praktikum_3.latihan.praktikum;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Membayar sebesar Rp" + amount + " menggunakan Kartu Kredit.");
    }
}