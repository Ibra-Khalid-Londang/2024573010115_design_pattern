package modul_2.bagian_3.latihan3;

public class AkunBank {
    // Atribut dengan akses private
    private double saldo;

    // Constructor untuk mengisi saldo awal
    public AkunBank(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Method public untuk menampilkan saldo
    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini: Rp" + saldo);
    }
}