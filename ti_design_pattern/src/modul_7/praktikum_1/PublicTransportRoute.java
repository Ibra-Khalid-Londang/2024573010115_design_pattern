package modul_7.praktikum_1;

// Strategy
public class PublicTransportRoute implements RouteStrategy {
    @Override
    public void buildRoute(String from, String to) {
        System.out.println("Membuat rute transportasi umum dari " + from + " ke " + to);
    }
}