package modul_5.praktikum_1.dengan_ocp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter payment type (CreditCard/Wallet): ");
        String type = scanner.next();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();

        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod paymentMethod;

        if (type.equalsIgnoreCase("CreditCard")) {
            paymentMethod = new CreditCardPayment();
        } else if (type.equalsIgnoreCase("EWallet")) {
            paymentMethod = new EWalletPayment();
        } else {
            System.out.println("Invalid payment method");
            return;
        }

        processor.processorPayment(paymentMethod, amount);
    }
}
