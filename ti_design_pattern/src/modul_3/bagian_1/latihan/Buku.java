package modul_3.bagian_1.latihan;

class Buku {
    // Atribut (Variabel)
    String judul;
    String penulis;
    int tahunTerbit;

    // Constructor untuk mempermudah pengisian data
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Detail Buku:");
        System.out.println("- Judul: " + judul);
        System.out.println("- Penulis: " + penulis);
        System.out.println("- Tahun Terbit: " + tahunTerbit);
        System.out.println("---------------------------");
    }
}