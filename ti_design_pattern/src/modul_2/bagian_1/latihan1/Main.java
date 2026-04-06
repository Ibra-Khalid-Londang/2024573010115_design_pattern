package modul_2.bagian_1.latihan1;

public class Main {
    public static void main(String[] args) {
        // Membuat object dari class Mahasiswa
        Buku buku1 = new Buku();

        // Mengisi nilai atribut
        buku1.judul = "Terang";
        buku1.pengarang = "Ibra Khalid";

        // Menampilkan nilai atribut
        System.out.println("Judul: " + buku1.judul);
        System.out.println("Pengarang: " + buku1.pengarang);
    }
}