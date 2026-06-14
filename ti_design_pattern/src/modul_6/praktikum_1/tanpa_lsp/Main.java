package modul_6.praktikum_1.tanpa_lsp;

public class Main {
    public static void testRectangle(Rectangle r){
        r.setWidth(5);
        r.setHeight(4);
        System.out.println("Hasil yang diharapkan: 20, hasil Output: " + r.calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        testRectangle(rect);

        Rectangle square = new Square();
        testRectangle(square);
    }
}
