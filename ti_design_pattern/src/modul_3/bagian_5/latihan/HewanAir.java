package modul_3.bagian_5.latihan;

abstract class HewanAir {
    protected String nama; // Protected agar bisa diakses oleh subclass-nya

    public HewanAir(String nama) {
        this.nama = nama;
    }

    // Method abstrak yang wajib diisi oleh anak (subclass)
    abstract void makan();

    // Method reguler yang bisa langsung digunakan
    public void info() {
        System.out.println("Nama Hewan: " + nama);
    }
}
