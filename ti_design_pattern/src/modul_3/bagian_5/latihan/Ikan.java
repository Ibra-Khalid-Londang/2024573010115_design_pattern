package modul_3.bagian_5.latihan;

class Ikan extends HewanAir implements Berenang {

    public Ikan(String nama) {
        super(nama); // Memanggil constructor dari class HewanAir
    }

    // Implementasi method dari interface Berenang
    @Override
    public void berenang() {
        System.out.println(nama + " berenang dengan menggerakkan siripnya.");
    }

    // Implementasi method abstrak dari class HewanAir
    @Override
    void makan() {
        System.out.println(nama + " sedang makan pelet atau plankton.");
    }
}
