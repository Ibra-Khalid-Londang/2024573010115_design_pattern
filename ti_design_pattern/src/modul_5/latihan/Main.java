package modul_5.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Update prompt untuk memasukkan opsi Truk
        System.out.print("Enter vehicle type (Car/Motorcycle/Truck): ");
        String type = scanner.next();

        System.out.print("Enter vehicle price: ");
        double price = scanner.nextDouble();

        TaxStrategy strategy = null;

        // Menentukan strategi berdasarkan input pengguna
        if (type.equalsIgnoreCase("Car")) {
            strategy = new CarTax();
        } else if (type.equalsIgnoreCase("Motorcycle")) {
            strategy = new MotorcycleTax();
        } else if (type.equalsIgnoreCase("Truck")) {
            strategy = new TruckTax();
        } else {
            System.out.println("Unknown vehicle type!");
            scanner.close();
            return;
        }

        TaxCalculator calculator = new TaxCalculator();
        // Memasukkan objek strategy ke dalam metode kalkulator
        double tax = calculator.calculateTax(strategy, price);

        System.out.println("Calculated tax: " + tax);

        scanner.close();
    }
}