package modul_2.bagian_5.latihan5;

public class Main {
    public static void main(String[] args) {
        // 1. Membuat object menggunakan Default Constructor
        Barang barang1 = new Barang();

        // 2. Membuat object menggunakan Parameterized Constructor
        Barang barang2 = new Barang("Laptop Asus", 8500000);

        // Menampilkan hasil
        System.out.println("Objek 1 (Default):");
        barang1.tampilkanBarang();

        System.out.println("Objek 2 (Parameterized):");
        barang2.tampilkanBarang();
    }
}