package modul_3.bagian_3.latihan;

class Laptop {
    private String merk;
    // Laptop "memiliki" Processor dan RAM (Composition)
    private Processor processor;
    private RAM ram;

    public Laptop(String merk, Processor processor, RAM ram) {
        this.merk = merk;
        this.processor = processor;
        this.ram = ram;
    }

    public void nyalakan() {
        System.out.println("Menyalakan laptop " + merk + "...");
        processor.jalankan();
        ram.baca();
        ram.tulis();
        System.out.println("Laptop siap digunakan!");
    }
}
