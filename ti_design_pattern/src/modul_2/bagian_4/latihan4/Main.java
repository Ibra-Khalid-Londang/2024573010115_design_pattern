package modul_2.bagian_4.latihan4;

public class Main {
    public static void main(String[] args) {
        // Membuat object dari class Mahasiswa
        Mahasiswa mhs = new Mahasiswa();

        // Menggunakan setter untuk mengisi nilai atribut
        mhs.setNama("Ibra");
        mhs.setNim("2024573010115");

        // Menampilkan nilai menggunakan getter
        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("NIM Mahasiswa: " + mhs.getNim());
    }
}