package modul_5.latihan;

public class MotorcycleTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.05;
    }
}
