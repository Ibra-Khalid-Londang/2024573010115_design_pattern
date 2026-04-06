package modul_2.bagian_3.latihan3;

public class Main {
    public static void main(String[] args) {
        AkunBank akunSaya = new AkunBank(500000);

        // 1. Memanggil method public (Berhasil)
        akunSaya.tampilkanSaldo();

        // 2. Mencoba akses atribut private langsung (Akan Error)
        // System.out.println(akunSaya.saldo);
    }
}