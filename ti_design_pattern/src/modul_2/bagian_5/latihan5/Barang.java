package modul_2.bagian_5.latihan5;

public class Barang {
    public String namaBarang;
    public double harga;

    // Default Constructor
    public Barang() {
        this.namaBarang = "Tanpa Nama";
        this.harga = 0;
    }

    // Parameterized Constructor
    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    // Method untuk menampilkan informasi barang
    public void tampilkanBarang() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: Rp" + harga);
        System.out.println("-------------------------");
    }
}
