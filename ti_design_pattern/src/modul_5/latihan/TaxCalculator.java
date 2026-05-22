package modul_5.latihan;

public class TaxCalculator {
    // Menerima interface TaxStrategy sebagai parameter, bukan String vehicleType
    public double calculateTax(TaxStrategy strategy, double price) {
        return strategy.calculateTax(price);
    }
}