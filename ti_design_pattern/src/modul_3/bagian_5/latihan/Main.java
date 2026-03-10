package modul_3.bagian_5.latihan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Ikan
        Ikan ikanMas = new Ikan("Ikan Mas");

        System.out.println("=== Aktivitas Ikan ===");
        ikanMas.info();
        ikanMas.makan();
        ikanMas.berenang();
    }
}
