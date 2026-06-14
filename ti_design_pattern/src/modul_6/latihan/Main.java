package modul_6.latihan;

public class Main {
    // Kontrak parameter diganti menjadi Navigable karena inti dari trip adalah navigasi
    public static void beginTrip(Navigable vehicle, String destination) {
        // Cek secara defensif polimorfis: Jika kendaraan punya mesin, nyalakan dulu
        if (vehicle instanceof EnginePowered) {
            ((EnginePowered) vehicle).startEngine();
        }

        // Semua kendaraan pasti bisa mengeksekusi ini dengan aman
        vehicle.navigateTo(destination);
    }

    public static void main(String[] args) {
        Navigable car = new Car();
        Navigable bike = new Bicycle();

        System.out.println("Car trip:");
        beginTrip(car, "Central Park");

        System.out.println("\nBike trip:");
        // Sekarang berjalan mulus tanpa perlu try-catch blocks yang mengantisipasi crash
        beginTrip(bike, "Central Park");
    }
}