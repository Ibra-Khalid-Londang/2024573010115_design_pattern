package modul_3.bagian_4.overloading.latihan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing class
        BangunDatar bangunUmum = new BangunDatar();
        Persegi kotak = new Persegi(5);
        Lingkaran bundar = new Lingkaran(7);

        // Memanggil method yang sudah di-override
        System.out.println("=== Hasil Perhitungan Luas ===");
        bangunUmum.hitungLuas(); // Memanggil method asli di induk
        kotak.hitungLuas();      // Memanggil method yang sudah diubah di Persegi
        bundar.hitungLuas();     // Memanggil method yang sudah diubah di Lingkaran
    }
}
