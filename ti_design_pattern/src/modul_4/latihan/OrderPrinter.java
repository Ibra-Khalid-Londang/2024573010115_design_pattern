package modul_4.latihan;

public class OrderPrinter {
    public void printReceipt(Order order, double total) {
        System.out.println("\nStruk Pesanan:");
        System.out.println("Produk: " + order.getProduct());
        System.out.println("Jumlah: " + order.getQuantity());
        System.out.println("Total Harga: Rp" + total);
        System.out.println("================================");
    }
}