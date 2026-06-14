package modul_7.praktikum_2;

public class Main {
    public static void main(String[] args) {
        PhotoEditor editor = new PhotoEditor();

        editor.setFilter(new BlackWhiteFilter());
        editor.applyFilter("foto1.jpg");

        editor.setFilter(new SepiaFIlter());
        editor.applyFilter("Foto2.jpg");

        editor.setFilter((new BrightFilter()));
        editor.applyFilter("Foto3.jpg");
    }
}
