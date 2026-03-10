package modul_3.bagian_3.latihan;

public class Main {
    public static void main(String[] args) {
        // Membuat komponen terlebih dahulu
        Processor intelCore = new Processor("Intel i7");
        RAM corsairRAM = new RAM(16);

        // Memasukkan komponen ke dalam objek Laptop
        Laptop myLaptop = new Laptop("Asus ROG", intelCore, corsairRAM);

        // Menjalankan metode laptop
        myLaptop.nyalakan();
    }
}
