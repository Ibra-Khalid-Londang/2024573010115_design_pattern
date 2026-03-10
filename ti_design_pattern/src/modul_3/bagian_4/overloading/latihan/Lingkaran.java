package modul_3.bagian_4.overloading.latihan;

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void hitungLuas() {
        double luas = Math.PI * jariJari * jariJari;
        System.out.format("Luas Lingkaran: %.2f\n", luas);
    }
}
