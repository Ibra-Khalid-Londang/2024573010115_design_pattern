package modul_3.bagian_4.overriding.latihan;

public class Main {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        System.out.println("Tambah 2 int: " + mtk.tambah(10, 20));
        System.out.println("Tambah 3 int: " + mtk.tambah(10, 20, 30));
        System.out.println("Tambah 2 double: " + mtk.tambah(10.5, 20.5));
    }
}

