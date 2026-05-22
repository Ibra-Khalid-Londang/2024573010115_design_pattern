package modul_5.latihan;

public class TruckTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.15;
    }
}