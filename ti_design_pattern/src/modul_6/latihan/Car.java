package modul_6.latihan;

public class Car implements Navigable, EnginePowered {
    @Override
    public void startEngine() {
        System.out.println("Car starts engine");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating Car route to " + destination);
    }
}