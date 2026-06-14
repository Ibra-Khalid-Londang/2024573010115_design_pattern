package modul_7.praktikum_1;

// Strategy
public class DrivingRoute implements RouteStrategy {
    @Override
    public void buildRoute(String from, String to) {
        System.out.println("Membuat rute berkendara dari " + from + " ke " + to);
    }
}