package app;

import app.controller.OrderController;
import app.model.DeliveryOrder;
import app.model.OrderComponent;
import app.model.PickupOrder;
import app.view.OrderView;

public class Main {
    public static void main(String[] args) {
        OrderController orderController = new OrderController();
        OrderView orderView = new OrderView();

        int categoryChoice = orderView.getCategoryChoice();
        OrderComponent orderComponent;

        if (categoryChoice == 1) {
            orderComponent = new PickupOrder();
        } else if (categoryChoice == 2) {
            orderComponent = new DeliveryOrder();
        } else {
            System.out.println("Invalid category choice.");
            return;
        }

        orderController.setOrderComponent(orderComponent);

        int quantity = orderView.getQuantity();
        double price = orderView.getPrice();

        double totalCost = orderController.processOrder(quantity, price);

        orderView.displayOrder(totalCost);
    }
}