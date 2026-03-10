package modul_3.bagian_2.latihan;

class Motor {
    // Atribut yang dienkapsulasi (private)
    private String merk;
    private int tahun;

    // Constructor
    public Motor(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    // Getter untuk merk
    public String getMerk() {
        return merk;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter untuk tahun
    public int getTahun() {
        return tahun;
    }

    // Setter untuk tahun
    public void setTahun(int tahun) {
        // Kita bisa menambah validasi di sini
        if (tahun > 1885) { // Tahun motor pertama kali diciptakan
            this.tahun = tahun;
        } else {
            System.out.println("Tahun tidak valid!");
        }
    }
}
