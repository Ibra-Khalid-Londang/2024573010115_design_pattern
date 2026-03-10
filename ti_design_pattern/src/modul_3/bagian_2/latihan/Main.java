package modul_3.bagian_2.latihan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek motor
        Motor motorSaya = new Motor("Honda", 2020);

        // Mengakses data menggunakan Getter
        System.out.println("Merk Motor: " + motorSaya.getMerk());
        System.out.println("Tahun: " + motorSaya.getTahun());

        // Mengubah data menggunakan Setter
        motorSaya.setMerk("Yamaha");
        motorSaya.setTahun(2023);

        System.out.println("\nSetelah diubah:");
        System.out.println("Merk Motor: " + motorSaya.getMerk());
        System.out.println("Tahun: " + motorSaya.getTahun());
    }
}
