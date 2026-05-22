package modul_4.latihan;

public class OrderCalculator {
    public double calculateTotal(Order order) {
        return order.getQuantity() * order.getPrice();
    }
}