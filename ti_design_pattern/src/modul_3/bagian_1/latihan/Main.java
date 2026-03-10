package modul_3.bagian_1.latihan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class Buku
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Buku buku2 = new Buku("Bumi", "Tere Liye", 2014);

        // Menampilkan informasi objek
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}
