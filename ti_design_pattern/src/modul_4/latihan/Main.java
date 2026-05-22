package modul_4.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama produk: ");
        String product = scanner.nextLine();
        System.out.print("Masukkan jumlah: ");
        int quantity = scanner.nextInt();
        System.out.print("Masukkan harga satuan: ");
        double price = scanner.nextDouble();

        // Membuat objek
        Order order = new Order(product, quantity, price);
        OrderCalculator calculator = new OrderCalculator();
        OrderRepository repository = new OrderRepository();
        OrderPrinter printer = new OrderPrinter();

        // Eksekusi tugas sesuai porsinya masing-masing
        double total = calculator.calculateTotal(order);
        repository.saveToFile(order, total);
        printer.printReceipt(order, total);
    }
}