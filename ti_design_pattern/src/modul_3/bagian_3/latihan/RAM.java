package modul_3.bagian_3.latihan;

class RAM {
    private int kapasitas; // dalam GB

    public RAM(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void baca() {
        System.out.println("RAM " + kapasitas + "GB sedang membaca data dari memori.");
    }

    public void tulis() {
        System.out.println("RAM " + kapasitas + "GB sedang menulis data ke memori.");
    }
}
