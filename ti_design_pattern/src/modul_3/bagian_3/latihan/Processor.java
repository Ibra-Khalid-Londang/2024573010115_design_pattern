package modul_3.bagian_3.latihan;

class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    public void jalankan() {
        System.out.println("Processor " + model + " sedang memproses data...");
    }
}
