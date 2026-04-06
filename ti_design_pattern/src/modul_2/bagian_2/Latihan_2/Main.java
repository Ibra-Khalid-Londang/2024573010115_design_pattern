package modul_2.bagian_2.Latihan_2;

public class Main {
    public static void main(String[] args) {
        // Membuat object dari class Lingkaran
        Lingkaran bundar = new Lingkaran();

        // Mengisi nilai atribut jariJari
        bundar.jariJari = 7;

        // Memanggil method hitungLuas dan menampilkannya
        System.out.println("Jari-jari Lingkaran: " + bundar.jariJari);
        System.out.println("Luas Lingkaran: " + bundar.hitungLuas());
    }
}