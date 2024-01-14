package app.view;

import app.utils.Rounder;
import java.util.Scanner;

public class OrderView {
    private static final String CURRENCY = "EUR";

    public void displayOrder(double totalCost) {
        String roundedTotalCost = Rounder.roundValue(totalCost);
        System.out.println("Order details:");
        System.out.println("Total cost: " + roundedTotalCost + " " + CURRENCY);
    }

    public int getCategoryChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the category of order:\n1. Self-pickup\n2. Delivery");
        return scanner.nextInt();
    }

    public int getQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of the product: ");
        return scanner.nextInt();
    }

    public double getPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of the product: ");
        String input = scanner.nextLine().replace(",", ".");
        return Double.parseDouble(input);
    }
}