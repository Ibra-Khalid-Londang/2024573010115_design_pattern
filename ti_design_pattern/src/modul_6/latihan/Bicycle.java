package modul_6.latihan;

public class Bicycle implements Navigable {
    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating BIKE route to " + destination);
        // Menggunakan logika rute khusus sepeda (misal: lewat jalur sepeda)
    }
}