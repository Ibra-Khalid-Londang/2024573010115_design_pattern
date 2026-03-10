package modul_3.bagian_4.overloading.latihan;

class BangunDatar {
    public void hitungLuas() {
        System.out.println("Menghitung luas bangun datar...");
    }
}

// Subclass Persegi
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }
}
