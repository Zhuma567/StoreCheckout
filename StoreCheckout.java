
import java.util.Scanner;

public class StoreCheckout {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("     STORE CHECKOUT SYSTEM");
        System.out.println("     Developed by Zhumanazar");
        String[] products = {"Laptop", "Phone", "Headphones", "Keyboard"};
        double[] prices = {500.0, 300.0, 50.0, 30.0};
        System.out.println("\nAvailable Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]
                    + " - $" + prices[i]);
        }
        System.out.print("\nChoose a product (1-4): ");
        int choice = input.nextInt();
        if (choice < 1 || choice > products.length) {
            System.out.println("Invalid product choice!");
            input.close();
            return;
        }
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero!");
            input.close();
            return;
        }
        double total = prices[choice - 1] * quantity;
        System.out.println("\nProduct: " + products[choice - 1]);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: $" + total);
        double discount = 0;
        if (total >= 100) {
            discount = total * 0.10;
            System.out.println("10% discount applied!");
        } else {
            System.out.println("No discount applied.");
        }
        double finalTotal = total - discount;
        System.out.println("Discount: $" + discount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.print("\nEnter payment amount: ");
        double payment = input.nextDouble();
        if (payment < finalTotal) {
            System.out.println("Insufficient payment!");
            System.out.println("You still need: $"
                    + (finalTotal - payment));
        } else if (payment == finalTotal) {
            System.out.println("Payment successful!");
            System.out.println("No change.");
        } else {
            double change = payment - finalTotal;
            System.out.println("Payment successful!");
            System.out.println("Your change: $" + change);
        }
        System.out.println("\n RECEIPT ");
        System.out.println("Customer: Zhumanazar");
        System.out.println("Product: " + products[choice - 1]);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + finalTotal);
        System.out.println("Thank you for shopping!");

        input.close();
    }
}
